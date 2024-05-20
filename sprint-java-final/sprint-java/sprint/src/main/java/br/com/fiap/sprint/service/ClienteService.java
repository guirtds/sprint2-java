package br.com.fiap.sprint.service;

import br.com.fiap.sprint.controller.dto.ClienteDTO;
import br.com.fiap.sprint.model.Cliente;
import br.com.fiap.sprint.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Cadastrando os clientes

    public Cliente cadastrarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setSobrenome(clienteDTO.getSobrenome());
        cliente.setGenero(clienteDTO.getGenero());
        cliente.setDataDeNascimento(clienteDTO.getDataDeNascimento());
        return clienteRepository.save(cliente);
    }

    // Atualizando os clientes

    public Cliente atualizarCliente(Long id, ClienteDTO novoCliente) {
        Optional<Cliente> clienteExistente = clienteRepository.findById(id);

        if(clienteExistente.isPresent()) {
            Cliente clienteAtualizado = clienteExistente.get();
            clienteAtualizado.setNome(novoCliente.getNome());
            clienteAtualizado.setSobrenome((novoCliente.getSobrenome()));
            clienteAtualizado.setGenero(novoCliente.getGenero());
            clienteAtualizado.setDataDeNascimento(novoCliente.getDataDeNascimento());
            return clienteRepository.save(clienteAtualizado);
        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }

    // Listando os cliente

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    // Deletando os clientes

    public void removerClientes(Long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente não encontrado com o ID: " + id);
        }
    }
}
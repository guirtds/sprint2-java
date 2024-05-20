package br.com.fiap.sprint.service;

import br.com.fiap.sprint.controller.dto.CadastroClienteDTO;
import br.com.fiap.sprint.model.CadastroCliente;
import br.com.fiap.sprint.repository.CadastroClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroClienteService {

    @Autowired
    private CadastroClienteRepository cadastroClienteRepository;

    // Realizando o cadastro dos clientes

    public CadastroCliente realizarCadastroCliente(CadastroClienteDTO cadastroClienteDTO) {
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setEmail(cadastroClienteDTO.getEmail());
        cadastroCliente.setSenha(cadastroClienteDTO.getSenha());
        cadastroCliente.setCelular(cadastroClienteDTO.getCelular());
        return cadastroClienteRepository.save(cadastroCliente);
    }

    // Atualizando o cadastro dos clientes

    public CadastroCliente atualizarCadastroCliente(Long id, CadastroClienteDTO novoCadastroCliente) {
        Optional<CadastroCliente> cadastroClienteExistente = cadastroClienteRepository.findById(id);

        if(cadastroClienteExistente.isPresent()) {
            CadastroCliente cadastroClienteAtualizado = cadastroClienteExistente.get();
            cadastroClienteAtualizado.setEmail(novoCadastroCliente.getEmail());
            cadastroClienteAtualizado.setSenha(novoCadastroCliente.getSenha());
            cadastroClienteAtualizado.setCelular(novoCadastroCliente.getCelular());
            return cadastroClienteRepository.save(cadastroClienteAtualizado);
        } else {
            throw new RuntimeException("Cadastro do cliente não encontrado com o ID: " + id);
        }
    }

    // Listando os cadastros dos cliente

    public List<CadastroCliente> listarCadastrosClientes() {
        return cadastroClienteRepository.findAll();
    }

    // Deletando os cadastroso dos clientes

    public void removerCadastrosClientes(Long id) {
        if (cadastroClienteRepository.existsById(id)) {
            cadastroClienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cadastro do cliente não encontrado com o ID: " + id);
        }
    }
}

package br.com.fiap.sprint.controller;

import br.com.fiap.sprint.controller.dto.ClienteDTO;
import br.com.fiap.sprint.model.Cliente;
import br.com.fiap.sprint.service.ClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(@Valid @RequestBody ClienteDTO cliente) {
        Cliente novoCliente = clienteService.cadastrarCliente(cliente);
        return ResponseEntity.ok(novoCliente);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody ClienteDTO novoCliente) {
        Cliente clienteAtualizado = clienteService.atualizarCliente(id, novoCliente);
        return ResponseEntity.ok(clienteAtualizado);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerClientes(@PathVariable Long id) {
        clienteService.removerClientes(id);
        return ResponseEntity.ok().build();
    }
}

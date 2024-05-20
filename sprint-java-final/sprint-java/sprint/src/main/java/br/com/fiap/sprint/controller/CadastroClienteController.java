package br.com.fiap.sprint.controller;

import br.com.fiap.sprint.controller.dto.CadastroClienteDTO;
import br.com.fiap.sprint.model.CadastroCliente;
import br.com.fiap.sprint.service.CadastroClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cadastroCliente")
public class CadastroClienteController {

    private final CadastroClienteService cadastroClienteService;

    @Autowired
    public CadastroClienteController(CadastroClienteService cadastroClienteService) {
        this.cadastroClienteService = cadastroClienteService;
    }

    @PostMapping
    public ResponseEntity<CadastroCliente> realizarCadastroCliente(@Valid @RequestBody CadastroClienteDTO cadastroCliente) {
        CadastroCliente novoCadastroCliente = cadastroClienteService.realizarCadastroCliente(cadastroCliente);
        return ResponseEntity.ok(novoCadastroCliente);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CadastroCliente> atualizarCadastroCliente(@PathVariable Long id, @RequestBody CadastroClienteDTO novoCadastroCliente) {
        CadastroCliente cadastroClienteAtualizado = cadastroClienteService.atualizarCadastroCliente(id, novoCadastroCliente);
        return ResponseEntity.ok(cadastroClienteAtualizado);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<CadastroCliente>> listarCadastrosClientes() {
        List<CadastroCliente> cadastrosClientes = cadastroClienteService.listarCadastrosClientes();
        return ResponseEntity.ok(cadastrosClientes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCadastrosClientes(@PathVariable Long id) {
        cadastroClienteService.removerCadastrosClientes(id);
        return ResponseEntity.ok().build();
    }
}

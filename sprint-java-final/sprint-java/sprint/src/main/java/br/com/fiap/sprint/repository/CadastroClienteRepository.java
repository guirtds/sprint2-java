package br.com.fiap.sprint.repository;

import br.com.fiap.sprint.model.CadastroCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroClienteRepository extends JpaRepository<CadastroCliente, Long> {
}

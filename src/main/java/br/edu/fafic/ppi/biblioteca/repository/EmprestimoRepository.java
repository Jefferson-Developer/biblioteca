package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, UUID> {

    public Emprestimo findEmprestimoByUuid(UUID uuid);

    public Emprestimo findEmprestimoByMatricula(String matricula);
}

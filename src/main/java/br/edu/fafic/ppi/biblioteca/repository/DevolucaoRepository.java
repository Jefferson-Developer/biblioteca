package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DevolucaoRepository extends JpaRepository<Devolucao, UUID> {

    public Devolucao getDevolucaoByEmprestimo(Emprestimo emprestimo);

    public Devolucao getDevolucaoByEmprestimo_Usuario_Matricula(String matricula);

}

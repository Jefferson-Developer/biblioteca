package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
    public Aluno findAlunoByMatricula(String matricula);
    public Aluno findAlunoByNome(String nome);
}

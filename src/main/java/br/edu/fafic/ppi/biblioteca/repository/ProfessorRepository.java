package br.edu.fafic.ppi.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
import br.edu.fafic.ppi.biblioteca.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, UUID> {

    public Professor findProfessorByMatricula(String matricula);
    public Professor findProfessorByNome(String nome);


}

package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fafic.ppi.biblioteca.domain.Bibliotecario;
import java.util.UUID;

public interface BibliotecariaRepository extends JpaRepository<Bibliotecario, UUID> {

    public Livro findAlunoByMatricula(String matricula);

}

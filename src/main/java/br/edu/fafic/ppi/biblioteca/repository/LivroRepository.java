package br.edu.fafic.ppi.biblioteca.repository;

import br.edu.fafic.ppi.biblioteca.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface LivroRepository extends JpaRepository<Livro, UUID> {

    public Livro findLivroByIsbn(String isbn);


}

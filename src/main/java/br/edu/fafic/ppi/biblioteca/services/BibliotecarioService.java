package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.repository.BibliotecariaRepository;
import br.edu.fafic.ppi.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.fafic.ppi.biblioteca.domain.Bibliotecario;

@Service
public class BibliotecarioService {

    private final BibliotecariaRepository bibliotecariaRepository;

    @Autowired
    public BibliotecarioService(BibliotecariaRepository bibliotecariaRepository){
        this.bibliotecariaRepository = bibliotecariaRepository;
    }

    public Bibliotecario saveBibliotecaria(Bibliotecario bibliotecario){
        return  bibliotecariaRepository.save(bibliotecario);
    }

}

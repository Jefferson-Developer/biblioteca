package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Livro;
import br.edu.fafic.ppi.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public Livro saveLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro getByIsbn(String isbn){
        return  livroRepository.findLivroByIsbn(isbn);
    }

    public Livro getByNome(String nome){
        return  livroRepository.findLivroByNome(nome);
    }

    public List<Livro> getAll(){
        return  livroRepository.findAll();
    }

    public void deleteLivro(UUID uuid){
        Livro livro = livroRepository.getOne(uuid);
        livroRepository.delete(livro);
    }

    public Livro LivroGetByArea(String area){
        return  livroRepository.findLivroByArea(area);
    }



}

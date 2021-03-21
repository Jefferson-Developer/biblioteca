package br.edu.fafic.ppi.biblioteca.resources;


import br.edu.fafic.ppi.biblioteca.domain.Livro;
import br.edu.fafic.ppi.biblioteca.dto.LivroDTO;
import br.edu.fafic.ppi.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/livro")
public class LivroResource {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity save(@RequestBody LivroDTO livroDTO){
        return ResponseEntity.ok()
                .body(livroService.saveLivro(Livro.create(livroDTO)));
    }

    @GetMapping("/get/{isbn}")
    public ResponseEntity getLivroByIsbn(@PathVariable("isbn") String isbn){
        return ResponseEntity.ok().body(livroService.getByIsbn(isbn));
    }
    @GetMapping("/all")
    public ResponseEntity getAllLivros(){
        return ResponseEntity.ok().body(livroService.getAll());
    }

    @PutMapping("/update")
    public ResponseEntity updateLivro(@RequestBody Livro livro){
        return ResponseEntity.ok().body(livroService.saveLivro(livro));
    }

    @DeleteMapping("/{uuid}")
    public  ResponseEntity deleteLivro(@PathVariable("uuid")UUID uuid){
        livroService.deleteLivro(uuid);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

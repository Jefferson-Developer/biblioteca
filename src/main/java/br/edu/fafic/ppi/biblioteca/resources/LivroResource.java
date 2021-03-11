package br.edu.fafic.ppi.biblioteca.resources;


import br.edu.fafic.ppi.biblioteca.domain.Livro;
import br.edu.fafic.ppi.biblioteca.dto.LivroDTO;
import br.edu.fafic.ppi.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}

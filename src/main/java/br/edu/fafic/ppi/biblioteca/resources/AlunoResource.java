package br.edu.fafic.ppi.biblioteca.resources;

import br.edu.fafic.ppi.biblioteca.domain.Aluno;
import br.edu.fafic.ppi.biblioteca.domain.Livro;
import br.edu.fafic.ppi.biblioteca.dto.AlunoDTO;
import br.edu.fafic.ppi.biblioteca.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {

    @Autowired
    private AlunoServices alunoService;

    @PostMapping
    public ResponseEntity save(@RequestBody Aluno aluno){
        return ResponseEntity.ok().body(alunoService.save(aluno));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody String matricula){
        return ResponseEntity.ok().body(alunoService.deleteAlunoByMatricula(matricula));
    }
}

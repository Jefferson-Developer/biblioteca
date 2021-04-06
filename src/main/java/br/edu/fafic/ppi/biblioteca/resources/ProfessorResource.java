package br.edu.fafic.ppi.biblioteca.resources;

import br.edu.fafic.ppi.biblioteca.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.edu.fafic.ppi.biblioteca.domain.Professor;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorResource {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public ResponseEntity save(@RequestBody Professor professor){
        return ResponseEntity.ok().body(professorService.save(professor));
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody String matricula){
        return ResponseEntity.ok().body(professorService.deleteProfessorByMatricula(matricula));
    }

}

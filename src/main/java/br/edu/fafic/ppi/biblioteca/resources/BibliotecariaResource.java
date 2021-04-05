package br.edu.fafic.ppi.biblioteca.resources;
import br.edu.fafic.ppi.biblioteca.services.BibliotecarioService;
import br.edu.fafic.ppi.biblioteca.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.edu.fafic.ppi.biblioteca.domain.Bibliotecario;
import br.edu.fafic.ppi.biblioteca.dto.BibliotecarioDTO;
import br.edu.fafic.ppi.biblioteca.services.AlunoServices;

@RestController
@RequestMapping(value = "/bibliotecaria")
public class BibliotecariaResource {

    @Autowired
    private AlunoServices alunoService;

    @Autowired
    private BibliotecarioService bibliotecarioService;

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public  ResponseEntity save(@RequestBody BibliotecarioDTO bibliotecarioDTO){
        return  ResponseEntity.ok().body(bibliotecarioService
                .saveBibliotecaria(Bibliotecario.create(bibliotecarioDTO)));
    }

    @GetMapping("/getAlunoByMatricula/{matricula}")
    public ResponseEntity getAlunoByMatricula(@PathVariable("matricula") String matricula){
        return ResponseEntity.ok().body(alunoService.getAlunoByMatricula(matricula));
    }

    @GetMapping("/getProfessorByMatricula/{matricula}")
    public  ResponseEntity getProfessorByMatricula(@PathVariable("matricula") String matricula){
        return ResponseEntity.ok().body(professorService.getProfessorByMatricula(matricula));
    }

    @GetMapping("/getAlunoByNome/{nome}")
    public ResponseEntity getAlunoByName(@PathVariable("nome") String nome){
        return ResponseEntity.ok().body(alunoService.getAlunoByNome(nome));
    }

    @GetMapping("/getProfessorByNome/{nome}")
    public ResponseEntity getProfessorByName(@PathVariable("nome") String nome){
        return ResponseEntity.ok().body(professorService.getProfessorByNome(nome));
    }


}

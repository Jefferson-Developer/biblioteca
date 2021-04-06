package br.edu.fafic.ppi.biblioteca.resources;

import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emprestimo")
public class EmprestimoResource {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public ResponseEntity save(@RequestBody Emprestimo emprestimo){
        return ResponseEntity.ok().body(emprestimoService.save(emprestimo));
    }

    @GetMapping("/getEmprestimoByMatricula/{matricula}")
    public ResponseEntity getEmprestimoByMatricula(@PathVariable("matricula") String matricula){
        return ResponseEntity.ok().body(emprestimoService.getEmprestimoByMatricula(matricula));
    }

}

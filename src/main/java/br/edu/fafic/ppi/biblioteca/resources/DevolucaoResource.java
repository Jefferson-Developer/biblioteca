package br.edu.fafic.ppi.biblioteca.resources;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.services.DevolucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/devolucao")
public class DevolucaoResource {

    @Autowired
    private DevolucaoService devolucaoService;

    @PostMapping
    public ResponseEntity save(@RequestBody Devolucao devolucao){
        return ResponseEntity.ok().body(devolucaoService.save(devolucao));
    }

    @PatchMapping
    public ResponseEntity patch(@RequestBody String emprestimoUuid, @RequestBody Boolean devolvido){
        return ResponseEntity.ok().body(devolucaoService.patch(emprestimoUuid, devolvido));
    }

}

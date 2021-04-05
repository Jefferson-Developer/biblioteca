package br.edu.fafic.ppi.biblioteca.resources;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.repository.EmprestimoRepository;
import br.edu.fafic.ppi.biblioteca.services.DevolucaoService;
import br.edu.fafic.ppi.biblioteca.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.UUID;

@RestController
@RequestMapping(value = "/devolucao")
public class DevolucaoResource {

    @Autowired
    private DevolucaoService devolucaoService;

    @PostMapping
    public ResponseEntity save(@RequestBody Devolucao devolucao){
        return ResponseEntity.ok().body(devolucaoService.save(devolucao));
    }

    @PatchMapping("/atualizar/{emprestimoUuid}/{devolvido}")
    public ResponseEntity patch(
            @PathVariable("emprestimoUuid") UUID emprestimoUuid,
            @PathVariable("devolvido") Boolean devolvido
    ){
        EmprestimoRepository emprestimoRepository = null;
        
        EmprestimoService emprestimoService = new EmprestimoService(emprestimoRepository);

        Emprestimo emprestimo = emprestimoService.getEmprestimoByUuid(emprestimoUuid);

        Devolucao devolucao = this.devolucaoService.getByEmprestimo(emprestimo);

        Calendar dataAtual = Calendar.getInstance();

        long diferença = dataAtual.getTime().getTime() - emprestimo.getDataEmprestimo().getTime().getTime();

        if (diferença > 3){
            devolucao.setMulta(
                    (double) (diferença * 2)
            );
        }

        devolucao.setDevolvido(devolvido);

        return ResponseEntity.ok().body(devolucaoService.save(devolucao));

    }

}

package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DevolucaoService {

    private final DevolucaoRepository devolucaoRepository;

    @Autowired
    public DevolucaoService(DevolucaoRepository devolucaoRepository){
        this.devolucaoRepository = devolucaoRepository;
    }

    public Devolucao save(Devolucao devolucao){
        return devolucaoRepository.save(devolucao);
    }

    public Devolucao getByEmprestimo(Emprestimo emprestimo){
        return devolucaoRepository.getDevolucaoByEmprestimo(emprestimo);
    }

    public Devolucao getByMatricula(String matricula){
        return devolucaoRepository.getDevolucaoByEmprestimo_Usuario_Matricula(matricula);
    }

    public Devolucao getAtrasadoByMatricula(String matricula){
        Devolucao devolucao = devolucaoRepository.getDevolucaoByEmprestimo_Usuario_Matricula(matricula);
        if (devolucao.getMulta() != null){
            return devolucao;
        }
        return new Devolucao();
    }

}

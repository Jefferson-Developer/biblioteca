package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Devolucao patch(String emprestimoUuid, Boolean devolvido){
        return devolucaoRepository.deleteDevolucaoByEmprestimo_Uuid(emprestimoUuid, devolvido);
    }



}
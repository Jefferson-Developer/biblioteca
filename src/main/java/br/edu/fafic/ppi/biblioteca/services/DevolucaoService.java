package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Devolucao;
import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.repository.DevolucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Devolucao> getByMatricula(String matricula){
        return devolucaoRepository.getDevolucaoByEmprestimo_Usuario_Matricula(matricula);
    }

    public List<Devolucao> getAtrasadoByMatricula(String matricula){
        List<Devolucao> devolucao = devolucaoRepository.getDevolucaoByEmprestimo_Usuario_Matricula(matricula);

        List<Devolucao> devolucaoList = new ArrayList<>();

        for (Devolucao dev: devolucaoList) {
            if (dev.getMulta() != null){
                devolucaoList.add(dev);
            }
        }

        return devolucaoList;
    }

}

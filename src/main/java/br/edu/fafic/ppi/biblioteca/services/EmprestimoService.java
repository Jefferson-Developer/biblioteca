package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import br.edu.fafic.ppi.biblioteca.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    @Autowired
    public EmprestimoService(EmprestimoRepository emprestimoRepository){
        this.emprestimoRepository = emprestimoRepository;
    }

    public Emprestimo save(Emprestimo emprestimo){
        return emprestimoRepository.save(emprestimo);
    }

    public Emprestimo getEmprestimoByUuid(UUID uuid){
        return emprestimoRepository.findEmprestimoByUuid(uuid);
    }



}

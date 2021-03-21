package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Aluno;
import br.edu.fafic.ppi.biblioteca.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServices {
    private final AlunoRepository alunoRepository;
    @Autowired
    public AlunoServices(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }
    public Aluno save(Aluno aluno){
        return  alunoRepository.save(aluno);
    }
}

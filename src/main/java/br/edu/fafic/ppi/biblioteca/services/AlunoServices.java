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

    public Aluno getAlunoByMatricula(String matricula){
        return  alunoRepository.findAlunoByMatricula(matricula);
    }
    public Aluno getAlunoByNome(String nome){
        return  alunoRepository.findAlunoByNome(nome);
    }
}

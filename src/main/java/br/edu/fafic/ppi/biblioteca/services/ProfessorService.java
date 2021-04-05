package br.edu.fafic.ppi.biblioteca.services;

import br.edu.fafic.ppi.biblioteca.domain.Aluno;
import br.edu.fafic.ppi.biblioteca.repository.AlunoRepository;
import br.edu.fafic.ppi.biblioteca.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import br.edu.fafic.ppi.biblioteca.domain.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor save(Professor professor){
        return  professorRepository.save(professor);
    }

    public Professor getProfessorByMatricula(String matricula){
        return  professorRepository.findProfessorByMatricula(matricula);
    }
    public Professor getProfessorByNome(String nome){
        return  professorRepository.findProfessorByNome(nome);
    }
}

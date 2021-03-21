package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno extends Pessoa{


    private CursoAluno cursoAluno;


}

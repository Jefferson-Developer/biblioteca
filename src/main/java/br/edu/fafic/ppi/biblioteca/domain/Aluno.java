package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "A")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno extends Usuario {

    @Embedded
    private CursoAluno cursoAluno;

}

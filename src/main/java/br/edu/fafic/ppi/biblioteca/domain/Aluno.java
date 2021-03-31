package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue(value = "A")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno extends Usuario implements Serializable {

    @Embedded
    private CursoAluno cursoAluno;

}

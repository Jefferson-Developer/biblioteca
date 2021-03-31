package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Embeddable
public class CursoAluno implements Serializable {

    private String nomeCurso;
    private int periodo;

}

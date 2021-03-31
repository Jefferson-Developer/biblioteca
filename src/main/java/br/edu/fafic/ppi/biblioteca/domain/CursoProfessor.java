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
public class CursoProfessor implements Serializable {

    String nome;
    String area;

}

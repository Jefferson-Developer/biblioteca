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
public class Contato implements Serializable {

    private String email;
    private String telefone;

}

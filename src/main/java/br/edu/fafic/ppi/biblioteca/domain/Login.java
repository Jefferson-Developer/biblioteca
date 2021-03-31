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
public class Login implements Serializable {

    private String matricula;
    private String senha;

}

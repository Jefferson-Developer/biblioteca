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
public class Endereco implements Serializable {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

}

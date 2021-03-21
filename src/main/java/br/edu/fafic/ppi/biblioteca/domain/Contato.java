package br.edu.fafic.ppi.biblioteca.domain;


import lombok.*;

import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Embeddable
public class Contato {
    private String email;
    private String telefone;
}

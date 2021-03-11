package br.edu.fafic.ppi.biblioteca.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LivroDTO {

    private String nome;

    private String isbn;


}

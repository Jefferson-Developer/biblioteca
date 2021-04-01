package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.enums.Area;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LivroDTO {

    private String nome;

    private String isbn;

    private Area area;

    private int quantidade;

}

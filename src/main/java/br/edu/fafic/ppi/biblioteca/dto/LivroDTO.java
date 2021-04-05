package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.enums.Area;
import lombok.*;

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

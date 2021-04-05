package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.domain.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfessorDTO {

    private Usuario usuario;

    private CursoProfessor cursoProfessor;


}

package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BibliotecarioDTO {

    private Usuario usuario;


}

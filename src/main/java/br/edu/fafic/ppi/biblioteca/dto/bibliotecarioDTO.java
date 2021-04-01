package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.domain.Contato;
import br.edu.fafic.ppi.biblioteca.domain.Endereco;
import br.edu.fafic.ppi.biblioteca.domain.Login;
import br.edu.fafic.ppi.biblioteca.enums.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class bibliotecarioDTO {

    private String nome;

    private String cpf;

    private Genero genero;

    private String matricula;

    private Endereco endereco;

    private Contato contato;

    private Login login;


}

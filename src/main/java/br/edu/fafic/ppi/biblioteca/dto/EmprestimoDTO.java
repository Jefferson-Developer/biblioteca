package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.domain.Livro;
import br.edu.fafic.ppi.biblioteca.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmprestimoDTO {

    private UUID uuid;

    private Usuario usuario;

    private Calendar dataEmprestimo;

    private List<Livro> livrosLocados;

}

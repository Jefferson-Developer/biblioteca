package br.edu.fafic.ppi.biblioteca.dto;

import br.edu.fafic.ppi.biblioteca.domain.Emprestimo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DevolucaoDTO {

    private Emprestimo emprestimo;

    private Calendar dataDevolucao;

    private Double multa;

    private Boolean devolvido;

}

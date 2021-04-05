package br.edu.fafic.ppi.biblioteca.domain;

import br.edu.fafic.ppi.biblioteca.dto.AlunoDTO;
import lombok.*;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue(value = "A")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno extends Usuario implements Serializable {

    @Embedded
    private CursoAluno cursoAluno;

    public static Aluno create(AlunoDTO alunoDTO) {
        return new ModelMapper().map(
                alunoDTO, Aluno.class
        );
    }

}

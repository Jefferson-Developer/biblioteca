package br.edu.fafic.ppi.biblioteca.domain;

import br.edu.fafic.ppi.biblioteca.dto.LivroDTO;
import lombok.*;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
public class Livro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String nome;

    @Column(unique = true)
    private String isbn;

    public static Livro create(LivroDTO livroDTO){
        return new ModelMapper().map(livroDTO, Livro.class);
    }
}

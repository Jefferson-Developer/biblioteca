package br.edu.fafic.ppi.biblioteca.domain;

import br.edu.fafic.ppi.biblioteca.dto.LivroDTO;
import br.edu.fafic.ppi.biblioteca.enums.Area;
import lombok.*;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Emprestimo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @OneToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Livro> livrosLocados;

}

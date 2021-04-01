package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
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

    private Calendar dataEmprestimo;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Livro> livrosLocados;

}

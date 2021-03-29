package br.edu.fafic.ppi.biblioteca.domain;

import br.edu.fafic.ppi.biblioteca.enums.Genero;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@DiscriminatorColumn(name = "tipo_pessoa")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@EqualsAndHashCode
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String nome;

    @Column(unique = true)
    private String cpf;

    @Enumerated(EnumType.ORDINAL)
    private Genero genero;

    @Column(unique = true)
    private String matricula;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Contato contato;

    @Embedded
    private Login login;

}

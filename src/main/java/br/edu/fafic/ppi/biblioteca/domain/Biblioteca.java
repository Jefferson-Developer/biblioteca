package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Embeddable
public class Biblioteca implements Serializable {

    private String nome;
    private String nomeInstituicao;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @OneToOne(cascade = CascadeType.ALL)
    private Bibliotecario bibliotecario;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Livro> acervoLivros;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

}

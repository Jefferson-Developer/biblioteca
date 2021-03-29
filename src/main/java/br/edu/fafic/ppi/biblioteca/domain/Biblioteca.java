package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
@Embeddable
public class Biblioteca {

    private String nome;
    private String nomeInstituicao;

    @OneToOne(cascade = CascadeType.ALL)
    private Bibliotecario bibliotecario;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Livro> acervoLivros;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

}

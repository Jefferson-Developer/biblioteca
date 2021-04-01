package br.edu.fafic.ppi.biblioteca.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@EqualsAndHashCode
@ToString
public class Devolucao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    @OneToOne(cascade = CascadeType.ALL)
    private Emprestimo emprestimo;

    private Calendar dataDevolucao;

    private Double multa;

    private Boolean devolvido;

}

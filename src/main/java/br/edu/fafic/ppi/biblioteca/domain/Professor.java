package br.edu.fafic.ppi.biblioteca.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue(value = "P")
@NoArgsConstructor
@AllArgsConstructor

@Data
public class Professor extends Usuario implements Serializable {

    @Embedded
    CursoProfessor cursoProfessor;

}

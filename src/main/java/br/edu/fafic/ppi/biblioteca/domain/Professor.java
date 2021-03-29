package br.edu.fafic.ppi.biblioteca.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "P")
@NoArgsConstructor
@AllArgsConstructor

@Data
public class Professor extends Usuario {

    @Embedded
    CursoProfessor cursoProfessor;

}

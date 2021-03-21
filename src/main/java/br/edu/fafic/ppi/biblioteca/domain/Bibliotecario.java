package br.edu.fafic.ppi.biblioteca.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
@NoArgsConstructor

@Data
public class Bibliotecario extends Pessoa {

}

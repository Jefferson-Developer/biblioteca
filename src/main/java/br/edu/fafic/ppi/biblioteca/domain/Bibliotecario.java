package br.edu.fafic.ppi.biblioteca.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@DiscriminatorValue(value = "B")
@NoArgsConstructor
@Embeddable
@Data
public class Bibliotecario extends Usuario implements Serializable {

}

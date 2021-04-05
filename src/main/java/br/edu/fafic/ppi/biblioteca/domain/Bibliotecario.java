package br.edu.fafic.ppi.biblioteca.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import br.edu.fafic.ppi.biblioteca.dto.BibliotecarioDTO;

@Entity
@DiscriminatorValue(value = "B")
@NoArgsConstructor
@Embeddable
@Data
public class Bibliotecario extends Usuario implements Serializable {


    public static Bibliotecario create(BibliotecarioDTO bibliotecarioDTO) {
        return new ModelMapper().map(
                bibliotecarioDTO, Bibliotecario.class
        );
    }

}

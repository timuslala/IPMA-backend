package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Osoba {
    @Id
    @GeneratedValue
    private Long id;

    
    private Strimg temat;
    private String tresc;

}

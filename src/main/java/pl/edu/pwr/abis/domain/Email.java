package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Email {
    @Id
    @GeneratedValue
    private Long id;

    
    private String temat;
    private String tresc;

}

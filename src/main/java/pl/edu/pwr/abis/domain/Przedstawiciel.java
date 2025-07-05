package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Przedstawiciel extends Uzytkownik {
    @OneToOne(optional = true, mappedBy = "przedstawiciel")
    private Organizacja organizacja;

}

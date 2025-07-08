package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Getter
@Setter
public class Jury extends Uzytkownik {
    @ManyToMany()
    private Set<EdycjaKonkursu> edycjeKonkursu;
    @ManyToMany()
    private Set<Aplikacja> projekty;
}

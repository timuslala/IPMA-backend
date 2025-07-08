package pl.edu.pwr.abis.domain;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CzlonekBiuraNagrody extends Uzytkownik {
    @ManyToMany()
    private Set<EdycjaKonkursu> edycjeKonkursu;

}

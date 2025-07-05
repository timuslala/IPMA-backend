package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Wydarzenie {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Strimg nazwa;
    @NotNull
    private TypWydarzenia typ;
    @NotNull
    private Data data;
    @ManyToOne()
    private EdycjaKonkursu edycjaKonkursu;
}

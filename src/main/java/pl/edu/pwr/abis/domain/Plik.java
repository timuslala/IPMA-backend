package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Plik {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Setter(access = AccessLevel.NONE)
    private Data dataUtworzenia;
    @NotNull
    private String nazwa;
    @NotNull
    @Setter(access = AccessLevel.NONE)
    private String typ;
    @NotNull
    @Column(unique = true)
    private String sciezka;
    @OneToOne(optional = true)
    private EdycjaKonkursu edycjaKonkursu;

}

package pl.edu.pwr.abis.domain;

import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.enums.*;

@Entity
@Getter
@Setter
public class Aplikacja{
    @Id
    private Integer numerAplikacji;
    @NotNull
    private StanAplikacji stan;
    @Column(nullable = true)
    private String powodOdrzucenia;
    @NotNull
    @Enumerated(EnumType.STRING)
    private StanOpłaty stanOplaty;
    @Column(nullable = true)
    private WynikAplikacji wynik;
    @NotNull
    private String nazwaProjektu;
    @NotNull
    private String opisProjektu;
    @NotNull
    private Integer czasTrwaniaMiesiace;
    @NotNull
    private Integer budzet;
    @NotNull
    private Integer liczbaCzlonkow;
    @NotNull
    private Integer liczbaPodwykonawcow;
    @NotNull
    private Boolean czyZgodnyZDefinicja;
    @NotNull
    private Boolean czyUkonczony;

    @Column(nullable = true)
    private static FazaOceny fazaOceny;
    private Double sredniaOcenaJury;

    private Boolean czyOrganizacjaInicjujaca;
    @ManyToOne()
    private KategoriaProjektu kategoriaProjektu;
    @ManyToOne()
    private EdycjaKonkursu edycjaKonkursu;
}

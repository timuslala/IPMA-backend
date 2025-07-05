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
    private Data dataZlozenia;
    @NotNull
    private StanAplikacji stan;
    @Column(optional = true)
    private String powodOdrzucenia;
    @NotNull
    private StanOplaty stanOplaty;
    @Column(optional = true)
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
    @Column(optional = true)
    private Data dataZakonczenia;
    @Column(optional = true)
    private static FazaOceny fazaOceny;
    private Double sredniaOcenaJury;
    @ManyToOne()
    private Osoba osoba;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE)
    private Plik listReferencyjny;
    @OneToMany(mappedBy = "aplikacja", cascade = CascadeType.REMOVE)
    private Plik[] zdjecia;
    @OneToMany(mappedBy = "aplikacja", cascade = CascadeType.REMOVE)
    private Plik[] logotypy;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE)
    private Plik film;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE)
    private Plik oswiadczenieAplikanta;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE)
    private Plik oswiadczenieInicjatora;
    @OneToMany(mappedBy = "aplikacja", cascade = CascadeType.REMOVE)
    private Pytanie[] pytanie;
    @OneToOne(optional = true, mappedBy = "aplikacja")
    private RaportAplikacyjny[] raportAplikacyjny;
    @ManyToOne()
    private Organizacja organizacja;
    private Boolean czyOrganizacjaInicjujaca;
    @ManyToOne()
    private KategoriaProjektu kategoriaProjektu;
    @ManyToMany()
    private Set<PrzydzialAsesora> przydzieleniAsesorowie;
    @ManyToOne(optional = true)
    private PrzydzialAsesora assesorWidacy;
}

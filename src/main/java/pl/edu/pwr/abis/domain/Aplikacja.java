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
    @AttributeOverrides({
        @AttributeOverride(name = "rok", column = @Column(name = "data_zlozenia_rok")),
        @AttributeOverride(name = "miesiac", column = @Column(name = "data_zlozenia_miesiac")),
        @AttributeOverride(name = "dzien", column = @Column(name = "data_zlozenia_dzien"))
    })
    private Data dataZlozenia;
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
    @AttributeOverrides({
        @AttributeOverride(name = "rok", column = @Column(name = "data_zakonczenia_rok")),
        @AttributeOverride(name = "miesiac", column = @Column(name = "data_zakonczenia_miesiac")),
        @AttributeOverride(name = "dzien", column = @Column(name = "data_zakonczenia_dzien"))
    })
    private Data dataZakonczenia;
    @Column(nullable = true)
    private static FazaOceny fazaOceny;
    private Double sredniaOcenaJury;
    @ManyToOne()
    private Osoba osoba;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik listReferencyjny;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik[] zdjecia;
    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik[] logotypy;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik film;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik oswiadczenieAplikanta;
    @OneToOne(optional = true, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Plik oswiadczenieInicjatora;
    @OneToMany(mappedBy = "aplikacja", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
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

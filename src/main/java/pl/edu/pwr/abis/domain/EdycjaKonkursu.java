package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EdycjaKonkursu{
    @Id
    private Integer numerEdycji;

    private Integer rok;
    private StanEdycjiKonkursu stanEdycjiKonkursu;
    private static Double kosztUczestnictwa;
    private Integer minLiczbaCzlonkowProjektu;
    private Integer minCzasTrwaniaProjektu;
    private Integer minLiczbaPodwykonawcow;
    private Integer maxCzasDoUkonczeniaProjektuMiesiace;
    private Data planowanaDataZlozeniaIO;
    @ManyToMany()
    private Set<CzlonekBiuraNagrody> skladBiuraNagrody;
    @ManyToOne(optional = true)
    private CzlonekBiuraNagrody przewodniczacyBiuraNagrody;
    @ManyToMany()
    private Set<Jury> skladJury;
    @ManyToOne(optional = true, mappedBy = "edycjaKonkursu")
    private Jury przewodniczacyJury;
    @OneToOne(optional = true, mappedBy = "edycjaKonkursu", cascade = CascadeType.REMOVE)
    private Plik listaFinalistow;
    //@OneToOne(optional = true, mappedBy = "edycjaKonkursu", cascade = CascadeType.REMOVE)
    private static Plik regulamin;
    @OneToOne(optional = true, mappedBy = "edycjaKonkursu", cascade = CascadeType.REMOVE)
    private Plik wyniki;
    @OneToMany(optional = true, mappedBy = "edycjaKonkursu")
    private Set<Wydarzenie> harmonogram;
    @ManyToMany(mappedBy = "edycjaKonkursu")
    private Set<KategoriaProjektu> kategorieProjektow;
}

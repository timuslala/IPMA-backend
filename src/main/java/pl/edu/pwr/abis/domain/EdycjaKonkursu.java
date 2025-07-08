package pl.edu.pwr.abis.domain;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.enums.StanEdycjiKonkursu;;
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
    @OneToMany(mappedBy = "edycjaKonkursu")
    private Set<Aplikacja> aplikacje;

    @ManyToMany()
    private Set<KategoriaProjektu> kategorieProjektow;
}

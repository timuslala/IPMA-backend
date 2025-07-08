package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import pl.edu.pwr.abis.domain.enums.StanDanych;
import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter
public class Organizacja {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String nip;
    @NotNull
    private String nazwa;
    @NotNull
    private String email;
    @NotNull
    private StanDanych stanDanych;
    @NotNull
    private Boolean czyPowiazanyZIPMA = false;
    @NotNull
    private String skrotNazwy;
    @NotNull
    private String nazwaNaFakturze;
    @OneToOne()
    private Osoba zarzadca;
    @OneToOne()
    private Przedstawiciel przedstawiciel;
    @OneToMany(mappedBy = "organizacja")
    private Set<Aplikacja> aplikacjeZainicjowane;
    @OneToMany(mappedBy = "organizacja")
    private List<Aplikacja> aplikacje;
}

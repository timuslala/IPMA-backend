package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    @OneToMany(mappedBy = "organizacja", optional = true)
    private Set<Aplikacja> aplikacjeZainicjowane;
    @OneToMany(mappedBy = "organizacja", optional = true)
    private List<Aplikacja> aplikacje;
}

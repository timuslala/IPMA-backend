package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Osoba {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Strimg imie;
    @NotNull
    private String nazwisko;
    @NotNull
    private String telefon;
    @NotNull
    private String email;
    @OneToMany()
    private Email[] nadaneMaile;
    @OneToMany()
    private Email[] odebraneMaile;
    @OneToMany(mappedBy = "osoba", optional = true)
    private Set<Aplikacja> aplikacja;
    private String stanowiskoZarzadcy;
    @OneToOne(optional = true, mappedBy = "osoba")
    private Organizacja organizacja;
}

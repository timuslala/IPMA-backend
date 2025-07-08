package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Getter
@Setter
public class Osoba {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String imie;
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
    @OneToMany(mappedBy = "osoba")
    private Set<Aplikacja> aplikacja;
    private String stanowiskoZarzadcy;
    @OneToOne(optional = true, mappedBy = "osoba")
    private Organizacja organizacja;
}

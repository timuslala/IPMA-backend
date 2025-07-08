package pl.edu.pwr.abis.domain;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
@Entity
@Getter
@Setter
public class Pytanie {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(unique = true)
    private String tresc;
    @Column(unique = true)
    private String odpowiedz;
    @OneToMany(mappedBy = "pytanie", cascade = CascadeType.REMOVE)
    private Set<Plik> zalacznik;
    @ManyToOne
    private Aplikacja aplikacja;
}

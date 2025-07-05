package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    @OneToMany(optional = true, mappedBy = "pytanie", cascade = CascadeType.REMOVE)
    private Plik zalacznik;

}

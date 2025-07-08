package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import pl.edu.pwr.abis.domain.enums.TypWydarzenia;

@Entity
@Getter
@Setter
public class Wydarzenie {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String nazwa;
    @NotNull
    private TypWydarzenia typ;
    @NotNull
    @Embedded
    private Data data;
    @ManyToOne()
    private EdycjaKonkursu edycjaKonkursu;
}

package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RaportAplikacyjny {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private StanRaportuAplikacyjnego stan;
    @NotNull
    private Data dataZlozenia;
    private String powodOdrzucenia;
    @OneToOne()
    private Aplikacja aplikacja;
}

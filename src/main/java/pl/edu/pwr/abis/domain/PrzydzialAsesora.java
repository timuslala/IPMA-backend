package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PrzydzialAsesora {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private StanWspółpracyAsesora stanWspolpracy;
    private String warunkiUmowy;
    @NotNull
    private Data dataZlozeniaPropozycji;
    @ManyToMany()
    private List<Aplikacja> aplikacje;

}

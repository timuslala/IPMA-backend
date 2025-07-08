package pl.edu.pwr.abis.domain;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.edu.pwr.abis.domain.enums.StanWspółpracyAsesora;
import jakarta.validation.constraints.NotNull;
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

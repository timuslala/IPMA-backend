package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import pl.edu.pwr.abis.domain.enums.StanKonta;

@Entity
@Getter
@Setter
public class Uzytkownik extends Osoba {
    @NotNull
    @Setter(AccessLevel.NONE)
    @Column(unique = true)
    private String login;
    @NotNull
    private StanKonta stanKonta;
}

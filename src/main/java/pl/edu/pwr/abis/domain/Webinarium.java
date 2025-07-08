package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import pl.edu.pwr.abis.domain.enums.TypWebinarium;

@Entity
@Getter
@Setter
public class Webinarium extends Wydarzenie {
    @NotNull
    private TypWebinarium typWebinarium;
}

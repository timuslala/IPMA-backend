package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Webinarium extends Wydarzenie {
    @NotNull
    private TypWebinarium typWebinarium;
}

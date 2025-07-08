package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class WydarzenieWielodniowe extends Wydarzenie {
    @NotNull
    @Embedded    
    @AttributeOverrides({
        @AttributeOverride(name = "rok", column = @Column(name = "data_konca_rok")),
        @AttributeOverride(name = "miesiac", column = @Column(name = "data_konca_miesiac")),
        @AttributeOverride(name = "dzien", column = @Column(name = "data_konca_dzien"))
    })
    private Data dataKonca;
}

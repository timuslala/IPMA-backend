package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
@Entity
@Getter
@Setter
public class WydarzenieMiejscowe extends Wydarzenie {
    @NotNull
    private String miejsce;
}

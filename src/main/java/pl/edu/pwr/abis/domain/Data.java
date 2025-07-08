package pl.edu.pwr.abis.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Data {
    private Integer rok;
    private Integer miesiac;
    private Integer dzien;
}
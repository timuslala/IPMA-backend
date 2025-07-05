package pl.edu.pwr.abis.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class KategoriaProjektu {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Setter(AccessLevel.NONE)
    @Column(unique = true)
    private String nazwa;

}

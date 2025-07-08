package pl.edu.pwr.abis.service.dto;


import pl.edu.pwr.abis.domain.Aplikacja;
public class KategoriaDTO {
    public String nazwaKategorii;

    public KategoriaDTO(Aplikacja Aplikacja) {
        this.nazwaKategorii = Aplikacja.getKategoriaProjektu().getNazwa();
    }
}

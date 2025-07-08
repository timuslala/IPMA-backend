package pl.edu.pwr.abis.service.dto;


import pl.edu.pwr.abis.domain.Aplikacja;
public class AplikacjaKategoriaDTO {
    public String nazwaProjektu;
    public String nazwaKategorii;

    public AplikacjaKategoriaDTO(Aplikacja aplikacja) {
        this.nazwaProjektu = aplikacja.getNazwaProjektu();
        this.nazwaKategorii = aplikacja.getKategoriaProjektu() != null ? aplikacja.getKategoriaProjektu().getNazwa() : null;
    }
}

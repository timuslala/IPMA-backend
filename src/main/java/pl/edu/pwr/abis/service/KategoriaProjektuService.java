package pl.edu.pwr.abis.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pl.edu.pwr.abis.domain.KategoriaProjektu;
import pl.edu.pwr.abis.repository.AplikacjaRepository;
import pl.edu.pwr.abis.repository.KategoriaProjektuRepository;
import pl.edu.pwr.abis.service.dto.KategoriaDTO;
@Service
@RequiredArgsConstructor
public class KategoriaProjektuService {
    @Autowired
    private final AplikacjaRepository aplikacjaRepository;
    @Autowired
    private final KategoriaProjektuRepository kategoriaProjektuRepository;

    
    public Set<KategoriaDTO> getAllKategorieFromLatestEdycjaKonkursu() {
        return aplikacjaRepository.findAll().stream()
                .filter(a -> a.getEdycjaKonkursu() != null && a.getEdycjaKonkursu().getRok().equals(getLatestEdycjaKonkursuYear()))
                .map(a -> new KategoriaDTO(a))
                .collect(Collectors.toSet());
    }
    public Integer getLatestEdycjaKonkursuYear() {
        return aplikacjaRepository.findAll().stream()
                .map(a -> a.getEdycjaKonkursu() != null ? a.getEdycjaKonkursu().getRok() : null)
                .filter(year -> year != null)
                .max(Integer::compareTo)
                .orElse(null);
    }
    public void updateKategoriaProjektu(Integer numerAplikacji, String nowaKategoria) {
        aplikacjaRepository.findById(numerAplikacji).ifPresent(aplikacja -> {
            aplikacja.setKategoriaProjektu(kategoriaProjektuRepository.findByNazwa(nowaKategoria));
            aplikacjaRepository.save(aplikacja);
        });
    }
}

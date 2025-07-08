package pl.edu.pwr.abis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pl.edu.pwr.abis.domain.Aplikacja;
import pl.edu.pwr.abis.repository.AplikacjaRepository;
import pl.edu.pwr.abis.service.dto.AplikacjaKategoriaDTO;

@Service
@RequiredArgsConstructor
public class AplikacjaService {
    @Autowired
    private final AplikacjaRepository aplikacjaRepository;
    
    public List<AplikacjaKategoriaDTO> getApplicationsFromLatestEdycjaKonkursu() {
        return aplikacjaRepository.findAll().stream()
                .filter(a -> a.getEdycjaKonkursu() != null && a.getEdycjaKonkursu().getRok().equals(getLatestEdycjaKonkursuYear()))
                .map(a -> new AplikacjaKategoriaDTO(a))
                .toList();
    }
    public Integer getLatestEdycjaKonkursuYear() {
        return aplikacjaRepository.findAll().stream()
                .map(a -> a.getEdycjaKonkursu() != null ? a.getEdycjaKonkursu().getRok() : null)
                .filter(year -> year != null)
                .max(Integer::compareTo)
                .orElse(null);
    }
}

package pl.edu.pwr.abis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import pl.edu.pwr.abis.domain.KategoriaProjektu;


@Repository
public interface KategoriaProjektuRepository extends JpaRepository<KategoriaProjektu, Integer> {
    KategoriaProjektu findByNazwa(String nazwa);
    List<KategoriaProjektu> findAllByNazwa(String nazwa);
    boolean existsByNazwa(String nazwa);
}
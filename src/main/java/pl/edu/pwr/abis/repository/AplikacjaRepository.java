package pl.edu.pwr.abis.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import pl.edu.pwr.abis.domain.Aplikacja;


@Repository
public interface AplikacjaRepository extends JpaRepository<Aplikacja, Integer> {}
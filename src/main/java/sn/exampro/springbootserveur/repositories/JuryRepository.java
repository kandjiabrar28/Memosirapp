package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Jury;

public interface JuryRepository extends JpaRepository<Jury, Long> {
}

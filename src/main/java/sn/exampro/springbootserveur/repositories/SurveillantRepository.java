package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Surveillant;

public interface SurveillantRepository extends JpaRepository<Surveillant,Long> {
}

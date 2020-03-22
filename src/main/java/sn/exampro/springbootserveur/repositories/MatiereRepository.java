package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
}

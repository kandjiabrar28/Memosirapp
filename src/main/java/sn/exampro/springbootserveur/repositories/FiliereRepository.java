package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Filiere;

public interface FiliereRepository extends JpaRepository<Filiere, Long> {
}

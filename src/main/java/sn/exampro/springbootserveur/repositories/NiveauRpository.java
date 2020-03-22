package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Niveau;

public interface NiveauRpository extends JpaRepository<Niveau, Long> {
}

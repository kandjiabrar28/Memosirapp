package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {
}

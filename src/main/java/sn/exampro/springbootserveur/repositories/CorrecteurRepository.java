package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Correcteur;

public interface CorrecteurRepository extends JpaRepository<Correcteur, Long> {
}

package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.PlageCopie;

public interface PlageCopieRepository extends JpaRepository<PlageCopie, Long> {
}

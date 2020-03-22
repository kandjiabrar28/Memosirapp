package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Candidats;

public interface CandidatsRepository extends JpaRepository<Candidats, Long> {
}

package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Specialite;

public interface SpecialiteRepository extends JpaRepository<Specialite, Long> {
}

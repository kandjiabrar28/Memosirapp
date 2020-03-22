package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Centre;

public interface CentreRepository extends JpaRepository<Centre, Long> {
}

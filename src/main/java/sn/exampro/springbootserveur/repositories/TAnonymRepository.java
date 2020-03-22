package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.TAnonym;

public interface TAnonymRepository extends JpaRepository<TAnonym, Long> {
}

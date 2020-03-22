package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Session;

public interface SessionRepository extends JpaRepository<Session,Long> {
}

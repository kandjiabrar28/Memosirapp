package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {
}

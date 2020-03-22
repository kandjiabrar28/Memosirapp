package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {
}

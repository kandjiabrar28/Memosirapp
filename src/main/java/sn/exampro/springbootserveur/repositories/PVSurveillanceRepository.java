package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.PVSurveillance;

public interface PVSurveillanceRepository extends JpaRepository<PVSurveillance, Long> {
}

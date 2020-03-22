package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Tables;

public interface TableRepository extends JpaRepository<Tables,Long> {
}

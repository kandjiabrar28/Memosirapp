package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}

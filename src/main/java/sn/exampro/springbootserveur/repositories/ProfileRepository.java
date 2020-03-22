package sn.exampro.springbootserveur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.exampro.springbootserveur.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

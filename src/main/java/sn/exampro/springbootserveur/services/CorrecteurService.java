package sn.exampro.springbootserveur.services;

import org.springframework.beans.factory.annotation.Autowired;
import sn.exampro.springbootserveur.entities.Correcteur;

import java.util.Collection;

public interface CorrecteurService {
    Correcteur create(Correcteur correcteur);
    Correcteur update(Correcteur correcteur);
    Collection<Correcteur> getAll();
    void delete(Long id);

}

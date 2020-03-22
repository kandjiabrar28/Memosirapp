package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Matiere;
import java.util.Collection;

public interface MatiereService {
    Matiere create(Matiere matiere);
    Matiere update(Matiere matiere);
    Collection<Matiere> getAll();
    void delete(Long id);
}

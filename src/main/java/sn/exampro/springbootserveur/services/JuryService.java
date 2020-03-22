package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Jury;
import java.util.Collection;

public interface JuryService {
    Jury create(Jury jury);
    Jury update(Jury jury);
    Collection<Jury> getAll();
    void delete(Long id);
}

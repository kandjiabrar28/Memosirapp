package sn.exampro.springbootserveur.services;


import sn.exampro.springbootserveur.entities.Filiere;
import java.util.Collection;

public interface FiliereService {
    Filiere create(Filiere filiere);
    Filiere update(Filiere filiere);
    Collection<Filiere> getAll();
    void delete(Long id);
}

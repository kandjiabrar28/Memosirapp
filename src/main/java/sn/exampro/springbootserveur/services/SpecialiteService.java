package sn.exampro.springbootserveur.services;


import sn.exampro.springbootserveur.entities.Specialite;
import java.util.Collection;

public interface SpecialiteService {
    Specialite create(Specialite specialite);
    Specialite update(Specialite specialite);
    Collection<Specialite> getAll();
    void delete(Long id);

}

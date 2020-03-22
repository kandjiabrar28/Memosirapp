package sn.exampro.springbootserveur.services;


import sn.exampro.springbootserveur.entities.Salle;

import java.util.Collection;

public interface SalleService {
    Salle create(Salle salle);
    Salle update(Salle salle);
    Collection<Salle> getAll();
    void delete(Long id);
}

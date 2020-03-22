package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Centre;

import java.util.Collection;

public interface CentreService {
    Centre create(Centre centre);
    Centre update(Centre centre);
    Collection<Centre> getAll();
    void delete(Long id);
}

package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Surveillant;

import java.util.Collection;

public interface SurveillantService {
    Surveillant create(Surveillant surveillant);
    Surveillant update(Surveillant surveillant);
    Collection<Surveillant> getAll();
    void delete (Long id);
}

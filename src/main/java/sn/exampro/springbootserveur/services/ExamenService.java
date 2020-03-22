package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Examen;

import java.util.Collection;

public interface ExamenService {
    Examen create(Examen examen);
    Examen update(Examen examen);
    Collection<Examen> getAll();
    void delete(Long id);
}

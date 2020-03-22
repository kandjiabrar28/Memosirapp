package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.PlageCopie;

import java.util.Collection;

public interface PlageCopieService {
    PlageCopie create(PlageCopie plageCopie);
    PlageCopie update(PlageCopie plageCopie);
    Collection<PlageCopie> getAll();
    void delete(Long id);

}

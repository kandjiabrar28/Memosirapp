package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Candidats;

import java.util.Collection;

public interface CandidatsService {
    Candidats create(Candidats candidats);
    Candidats update(Candidats candidats);
    Collection<Candidats> getAll();
    void delete(Long id);
}

package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.TAnonym;

import java.util.Collection;

public interface TAnonymService {
    TAnonym create(TAnonym tAnonym);
    TAnonym update(TAnonym tAnonym);
    Collection<TAnonym> getAll();
    void delete(Long id);
}

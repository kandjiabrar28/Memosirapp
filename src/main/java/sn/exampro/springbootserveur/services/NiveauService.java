package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Niveau;

import java.util.Collection;

public interface NiveauService {
    public Niveau create(Niveau niveau);
    public Niveau update(Niveau niveau);
    Collection<Niveau> getAll();
    void delete(Long id);

}

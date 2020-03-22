package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Utilisateur;

import java.util.Collection;

public interface UtilisateurService {
    Utilisateur create(Utilisateur utilisateur);
    Utilisateur update(Utilisateur utilisateur);
    Collection<Utilisateur> getAll();
    void delete(Long id);
}

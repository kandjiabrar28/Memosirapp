package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Profile;

import java.util.Collection;

public interface ProfileService {
    Profile create(Profile profile);
    Profile update(Profile profile);
    Collection<Profile> getAll();
    void delete(Long id);
}

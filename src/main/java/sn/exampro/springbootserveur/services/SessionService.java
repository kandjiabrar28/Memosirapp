package sn.exampro.springbootserveur.services;


import sn.exampro.springbootserveur.entities.Session;
import java.util.Collection;

public interface SessionService {
    Session create(Session session);
    Session update(Session session);
    Collection<Session> getAll();
    void delete(Long id);
}

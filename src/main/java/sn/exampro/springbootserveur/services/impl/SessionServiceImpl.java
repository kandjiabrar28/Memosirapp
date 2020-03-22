package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Session;
import sn.exampro.springbootserveur.repositories.SessionRepository;
import sn.exampro.springbootserveur.services.SessionService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Service
@Transactional
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;
    @Override
    public Session create(Session session) {
        session.setDateCreation(new Date());
        session.setDateModification(new Date());
        return sessionRepository.save(session);
    }

    @Override
    public Session update(Session session) {
        Optional<Session> optionalSession=sessionRepository.findById(session.getIdsession());
        if(optionalSession.isPresent()){
            session.setDateModification(new Date());
            sessionRepository.saveAndFlush(session);
        }
        return null;
    }

    @Override
    public Collection<Session> getAll() {
        return sessionRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Session> optionalSession=sessionRepository.findById(id);
        if(optionalSession.isPresent()){
            sessionRepository.delete(optionalSession.get());
        }

    }
}

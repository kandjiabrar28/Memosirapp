package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.TAnonym;
import sn.exampro.springbootserveur.repositories.TAnonymRepository;
import sn.exampro.springbootserveur.services.TAnonymService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class TAnonymServiceImpl implements TAnonymService {
    @Autowired
    private TAnonymRepository tAnonymRepository;

    @Override
    public TAnonym create(TAnonym tAnonym) {
        tAnonym.setDateCreation(new Date());
        tAnonym.setDateModification(new Date());
        return tAnonymRepository.save(tAnonym);
    }

    @Override
    public TAnonym update(TAnonym tAnonym) {
        Optional<TAnonym> optionalTAnonym=tAnonymRepository.findById(tAnonym.getIdanonym());
        if(optionalTAnonym.isPresent()){
            tAnonym.setDateModification(new Date());
            tAnonymRepository.saveAndFlush(tAnonym);
        }
        return null;
    }

    @Override
    public Collection<TAnonym> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<TAnonym> optionalTAnonym=tAnonymRepository.findById(id);
        if(optionalTAnonym.isPresent()){
            tAnonymRepository.delete(optionalTAnonym.get());
        }

    }
}

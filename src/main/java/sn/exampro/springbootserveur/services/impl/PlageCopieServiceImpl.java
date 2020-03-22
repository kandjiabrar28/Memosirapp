package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.PlageCopie;
import sn.exampro.springbootserveur.repositories.PlageCopieRepository;
import sn.exampro.springbootserveur.services.PlageCopieService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Service
@Transactional
public class PlageCopieServiceImpl implements PlageCopieService {

    @Autowired
    private PlageCopieRepository plageCopieRepository;

    @Override
    public PlageCopie create(PlageCopie plageCopie) {
        plageCopie.setDateCreation(new Date());
        plageCopie.setDateModification(new Date());
        return plageCopieRepository.save(plageCopie);
    }

    @Override
    public PlageCopie update(PlageCopie plageCopie) {
        Optional<PlageCopie> plageCopieOptional=plageCopieRepository.findById(plageCopie.getIdplage());
        if(plageCopieOptional.isPresent()){
            plageCopie.setDateModification(new Date());
            plageCopieRepository.saveAndFlush(plageCopie);
        }
        return null;
    }

    @Override
    public Collection<PlageCopie> getAll() {
        return plageCopieRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<PlageCopie> plageCopieOptional=plageCopieRepository.findById(id);
        if(plageCopieOptional.isPresent()){
            plageCopieRepository.delete(plageCopieOptional.get());
        }

    }
}

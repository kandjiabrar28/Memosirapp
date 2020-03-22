package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Filiere;
import sn.exampro.springbootserveur.repositories.FiliereRepository;
import sn.exampro.springbootserveur.services.FiliereService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class FiliereServiceImpl implements FiliereService {
    
    @Autowired
    private FiliereRepository filiereRepository;

    @Override
    public Filiere create(Filiere filiere) {
        filiere.setDateCreation(new Date());
        filiere.setDateModification(new Date());
        return filiereRepository.save(filiere);
    }

    @Override
    public Filiere update(Filiere filiere) {
        Optional<Filiere> filiereOptional= filiereRepository.findById(filiere.getIdfiliere());
        if(filiereOptional.isPresent()){
            filiere.setDateCreation(new Date());
            filiereRepository.saveAndFlush(filiere);
        }
        return null;
    }

    @Override
    public Collection<Filiere> getAll() {
        return filiereRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Filiere> filiereOptional= filiereRepository.findById(id);
        if(filiereOptional.isPresent()){
            filiereRepository.delete(filiereOptional.get());
        }

    }
}

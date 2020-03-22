package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Specialite;
import sn.exampro.springbootserveur.repositories.SpecialiteRepository;
import sn.exampro.springbootserveur.services.SpecialiteService;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class SpecialiteServiceImpl implements SpecialiteService {

    @Autowired
    private SpecialiteRepository specialiteRepository;

    @Override
    public Specialite create(Specialite specialite) {
        specialite.setDateCreation(new Date());
        specialite.setDateModification(new Date());
        return specialiteRepository.save(specialite);
    }

    @Override
    public Specialite update(Specialite specialite) {
        Optional<Specialite> optionalSpecialite=specialiteRepository.findById(specialite.getIdspecialite());
        if(optionalSpecialite.isPresent()){
            specialite.setDateModification(new Date());
            specialiteRepository.saveAndFlush(specialite);
        }
        return null;
    }

    @Override
    public Collection<Specialite> getAll() {
        return specialiteRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Specialite> optionalSpecialite=specialiteRepository.findById(id);
        if(optionalSpecialite.isPresent()){
            specialiteRepository.delete(optionalSpecialite.get());
        }

    }
}

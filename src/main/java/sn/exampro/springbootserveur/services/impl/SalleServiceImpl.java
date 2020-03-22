package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Salle;
import sn.exampro.springbootserveur.repositories.SalleRepository;
import sn.exampro.springbootserveur.services.SalleService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Service
@Transactional
public class SalleServiceImpl implements SalleService {

    @Autowired
    private SalleRepository salleRepository;
    @Override
    public Salle create(Salle salle) {
        salle.setDateCreation(new Date());
        salle.setDateModification(new Date());
        return salleRepository.save(salle);
    }

    @Override
    public Salle update(Salle salle) {
        Optional<Salle> salleOptional=salleRepository.findById(salle.getIdsalle());
        if(salleOptional.isPresent()){
            salle.setDateModification(new Date());
            salleRepository.saveAndFlush(salle);
        }
        return null;
    }

    @Override
    public Collection<Salle> getAll() {
        return salleRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Salle> salleOptional=salleRepository.findById(id);
        if(salleOptional.isPresent()){
            salleRepository.delete(salleOptional.get());
        }

    }
}

package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Surveillant;
import sn.exampro.springbootserveur.repositories.SurveillantRepository;
import sn.exampro.springbootserveur.services.SurveillantService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;


@Transactional
@Service
public class SurveillantServiceImpl implements SurveillantService {
    
    @Autowired
    private SurveillantRepository surveillantRepository;

    @Override
    public Surveillant create(Surveillant surveillant) {
        surveillant.setDateCreation(new Date());
        surveillant.setDateModification(new Date());
        return surveillantRepository.save(surveillant);
    }

    @Override
    public Surveillant update(Surveillant surveillant) {
        Optional<Surveillant> surveillantOptional= surveillantRepository.findById(surveillant.getIduser());
        if(surveillantOptional.isPresent()){
            surveillant.setDateCreation(new Date());
            surveillantRepository.saveAndFlush(surveillant);
        }
        return null;
    }

    @Override
    public Collection<Surveillant> getAll() {
        return surveillantRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Surveillant> surveillantOptional= surveillantRepository.findById(id);
        if(surveillantOptional.isPresent()){
            surveillantRepository.delete(surveillantOptional.get());
        }

    }
}

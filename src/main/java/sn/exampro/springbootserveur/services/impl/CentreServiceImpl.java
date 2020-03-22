package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Centre;
import sn.exampro.springbootserveur.repositories.CentreRepository;
import sn.exampro.springbootserveur.services.CentreService;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Service
@Transactional
public class CentreServiceImpl implements CentreService {
    @Autowired
    private CentreRepository centreRepository;

    @Override
    public Centre create(Centre centre) {
        centre.setDateCreation(new Date());
        centre.setDateModification(new Date());
        
        return centreRepository.save(centre);
    }

    @Override
    public Centre update(Centre centre) {
        Optional<Centre> centreOptional= centreRepository.findById(centre.getIdcentre());
        if(centreOptional.isPresent()){
            centre.setDateCreation(new Date());
            centreRepository.saveAndFlush(centre);
        }
        return null;
    }

    @Override
    public Collection<Centre> getAll() {
        return centreRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Centre> centreOptional= centreRepository.findById(id);
        if(centreOptional.isPresent()){
            centreRepository.delete(centreOptional.get());
        }

    }
}

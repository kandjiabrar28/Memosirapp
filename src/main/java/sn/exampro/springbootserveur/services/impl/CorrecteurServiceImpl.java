package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Correcteur;
import sn.exampro.springbootserveur.repositories.CorrecteurRepository;
import sn.exampro.springbootserveur.services.CorrecteurService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class CorrecteurServiceImpl implements CorrecteurService {
    @Autowired
    private CorrecteurRepository correcteurRepository;

    @Override
    public Correcteur create(Correcteur Correcteur) {
        Correcteur.setDateCreation(new Date());
        Correcteur.setDateModification(new Date());
        return correcteurRepository.save(Correcteur);
    }

    @Override
    public Correcteur update(Correcteur Correcteur) {
        Optional<Correcteur> correcteurOptional= correcteurRepository.findById(Correcteur.getIduser());
        if(correcteurOptional.isPresent()){
            Correcteur.setDateCreation(new Date());
            correcteurRepository.saveAndFlush(Correcteur);
        }
        return null;
    }

    @Override
    public Collection<Correcteur> getAll() {
        return correcteurRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Correcteur> correcteurOptional= correcteurRepository.findById(id);
        if(correcteurOptional.isPresent()){
            correcteurRepository.delete(correcteurOptional.get());
        }

    }
}

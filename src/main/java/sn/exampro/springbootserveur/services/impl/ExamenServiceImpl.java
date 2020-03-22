package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Examen;
import sn.exampro.springbootserveur.repositories.ExamenRepository;
import sn.exampro.springbootserveur.services.ExamenService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public Examen create(Examen utilisateur) {
        utilisateur.setDateCreation(new Date());
        utilisateur.setDateModification(new Date());
        return examenRepository.save(utilisateur);
    }

    @Override
    public Examen update(Examen examen) {
        Optional<Examen> candidatOptional= examenRepository.findById(examen.getIdexamen());
        if(candidatOptional.isPresent()){
            examen.setDateCreation(new Date());
            examenRepository.saveAndFlush(examen);
        }
        return null;
    }

    @Override
    public Collection<Examen> getAll() {
        return examenRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Examen> examenOptional= examenRepository.findById(id);
        if(examenOptional.isPresent()){
            examenRepository.delete(examenOptional.get());
        }

    }
}

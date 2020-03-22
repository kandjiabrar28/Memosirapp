package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Candidats;
import sn.exampro.springbootserveur.repositories.CandidatsRepository;
import sn.exampro.springbootserveur.services.CandidatsService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Transactional
@Service
public class CandidatsServiceImpl implements CandidatsService {

    @Autowired
    private CandidatsRepository candidatsRepository;

    @Override
    public Candidats create(Candidats candidats) {
        candidats.setDateCreation(new Date());
        candidats.setDateModification(new Date());
        return candidatsRepository.save(candidats);
    }

    @Override
    public Candidats update(Candidats candidats) {
        Optional<Candidats> optionalCandidats=candidatsRepository.findById(candidats.getIduser());
        if(optionalCandidats.isPresent()){
            candidats.setDateModification(new Date());
            candidatsRepository.saveAndFlush(candidats);
        }

        return null;
    }

    @Override
    public Collection<Candidats> getAll() {
        return candidatsRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Candidats> candidatsOptional=candidatsRepository.findById(id);
        if(candidatsOptional.isPresent()){
            candidatsRepository.delete(candidatsOptional.get());
        }

    }
}

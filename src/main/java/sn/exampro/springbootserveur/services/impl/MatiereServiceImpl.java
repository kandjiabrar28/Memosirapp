package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Matiere;
import sn.exampro.springbootserveur.repositories.MatiereRepository;
import sn.exampro.springbootserveur.services.MatiereService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class MatiereServiceImpl implements MatiereService {

    @Autowired
    private MatiereRepository matiereRepository;
    @Override
    public Matiere create(Matiere matiere) {
        matiere.setDateCreation(new Date());
        matiere.setDateModification(new Date());
        return matiereRepository.save(matiere);
    }

    @Override
    public Matiere update(Matiere matiere) {

        Optional<Matiere> matiereOptional= matiereRepository.findById(matiere.getIdmatiere());
        if(matiereOptional.isPresent()) {
            matiere.setDateCreation(new Date());
            matiereRepository.saveAndFlush(matiere);
        }
        return null;
    }

    @Override
    public Collection<Matiere> getAll() {
        return matiereRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Matiere> matiereOptional= matiereRepository.findById(id);
        if(matiereOptional.isPresent()){
            matiereRepository.delete(matiereOptional.get());
        }
    }
}

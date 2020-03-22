package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Niveau;
import sn.exampro.springbootserveur.repositories.NiveauRpository;
import sn.exampro.springbootserveur.services.NiveauService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class NiveauServiceImpl implements NiveauService {
    @Autowired
    private NiveauRpository niveauRpository;
    @Override
    public Niveau create(Niveau niveau) {
        niveau.setDateCreation(new Date());
        niveau.setDateModification(new Date());
        return niveauRpository.save(niveau);
    }

    @Override
    public Niveau update(Niveau niveau) {
        Optional<Niveau> niveauOptional=niveauRpository.findById(niveau.getIdniveau());
        if(niveauOptional.isPresent()){
            niveau.setDateModification(new Date());
            niveauRpository.saveAndFlush(niveau);
        }
        return null;
    }

    @Override
    public Collection<Niveau> getAll() {
        return niveauRpository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Niveau> niveauOptional=niveauRpository.findById(id);
        if(niveauOptional.isPresent()){
            niveauRpository.delete(niveauOptional.get());
        }

    }
}

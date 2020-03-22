package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Jury;
import sn.exampro.springbootserveur.repositories.JuryRepository;
import sn.exampro.springbootserveur.services.JuryService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class JuryServiceImpl implements JuryService {

    @Autowired
    private JuryRepository juryRepository;

    @Override
    public Jury create(Jury jury) {
        jury.setDateCreation(new Date());
        jury.setDateCreation(new Date());
        return juryRepository.save(jury);
    }

    @Override
    public Jury update(Jury jury) {
        Optional<Jury> juryOptional = juryRepository.findById(jury.getIdjury());
        if (juryOptional.isPresent()) {
            jury.setDateCreation(new Date());
            juryRepository.saveAndFlush(jury);
        }
        return null;
    }

    @Override
    public Collection<Jury> getAll() {
        return juryRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Jury> juryOptional = juryRepository.findById(id);
        if (juryOptional.isPresent()) {
            juryRepository.delete(juryOptional.get());

        }
    }
}
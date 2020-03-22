package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Notes;
import sn.exampro.springbootserveur.repositories.NotesRepository;
import sn.exampro.springbootserveur.services.NotesService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Service
@Transactional
public class NotesServiceImpl implements NotesService {
    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes create(Notes notes) {
        notes.setDateCreation(new Date());
        notes.setDateModification(new Date());
        notesRepository.save(notes);
        return null;
    }

    @Override
    public Notes update(Notes notes) {
        Optional<Notes> notesOptional=notesRepository.findById(notes.getIdnote());
        if(notesOptional.isPresent()){
            notes.setDateModification(new Date());
            notesRepository.saveAndFlush(notes);
        }
        return null;
    }

    @Override
    public Collection<Notes> getAll() {
        return notesRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Notes> notesOptional=notesRepository.findById(id);
        if(notesOptional.isPresent()){

            notesRepository.delete(notesOptional.get());
        }

    }
}

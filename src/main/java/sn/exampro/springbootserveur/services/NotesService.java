package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.Notes;
import java.util.Collection;

public interface NotesService {

    Notes create(Notes notes);
    Notes update(Notes notes);
    Collection<Notes> getAll();
    void delete(Long id);
}

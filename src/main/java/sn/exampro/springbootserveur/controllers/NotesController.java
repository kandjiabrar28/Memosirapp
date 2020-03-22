package sn.exampro.springbootserveur.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Notes;
import sn.exampro.springbootserveur.services.NotesService;
import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class NotesController {
    
    @Autowired
    private NotesService notesService;

    @PostMapping(value = "/notes",produces = MediaType.APPLICATION_JSON_VALUE)
    public Notes createNote(@RequestBody Notes notes){
        return notesService.create(notes);
    }
    @PutMapping(value = "/notes/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Notes update(@RequestBody Notes notes, @PathVariable Long id){
        notes.setIdnote(id);
        return notesService.update(notes);
    }
    @GetMapping(value = "/notes",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Notes> findAll(){
        return notesService.getAll();
    }
    @DeleteMapping(value = "/notes/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        notesService.delete(id);
    }
}

package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Correcteur;
import sn.exampro.springbootserveur.services.CorrecteurService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class CorrecteurController {

    @Autowired
    private CorrecteurService correcteurService;

    @PostMapping(value = "/correcteurs",produces = MediaType.APPLICATION_JSON_VALUE)
    public Correcteur createCorrecteur(@RequestBody Correcteur correcteur){
        return correcteurService.create(correcteur);
    }
    @PutMapping(value = "/correcteurs/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Correcteur update(@RequestBody Correcteur correcteur, @PathVariable Long id){
        correcteur.setIduser(id);
        return correcteurService.update(correcteur);
    }
    @GetMapping(value = "/correcteurs",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Correcteur> findAll(){
        return correcteurService.getAll();
    }
    @DeleteMapping(value = "/correcteurs/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        correcteurService.delete(id);
    }


}

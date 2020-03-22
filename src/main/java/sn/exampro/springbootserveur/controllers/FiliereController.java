package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Filiere;
import sn.exampro.springbootserveur.services.FiliereService;


import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class FiliereController {
    
    @Autowired
    private FiliereService filiereService;

    @PostMapping(value = "/filieres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Filiere createFiliere(@RequestBody Filiere filiere){
        return filiereService.create(filiere);
    }
    @PutMapping(value = "/filieres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Filiere update(@RequestBody Filiere filiere, @PathVariable Long id){
        filiere.setIdfiliere(id);
        return filiereService.update(filiere);
    }
    @GetMapping(value = "/filieres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Filiere> findAll(){
        return filiereService.getAll();
    }
    @DeleteMapping(value = "/filieres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        filiereService.delete(id);
    }
}

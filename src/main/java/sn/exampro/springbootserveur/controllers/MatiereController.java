package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Matiere;
import sn.exampro.springbootserveur.services.MatiereService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class MatiereController {
    
    @Autowired
    private MatiereService matiereService;

    @PostMapping(value = "/matieres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Matiere createMatiere(@RequestBody Matiere matiere){
        return matiereService.create(matiere);
    }
    @PutMapping(value = "/matieres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Matiere update(@RequestBody Matiere matiere, @PathVariable Long id){
        matiere.setIdmatiere(id);
        return matiereService.update(matiere);
    }
    @GetMapping(value = "/matieres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Matiere> findAll(){
        return matiereService.getAll();
    }
    @DeleteMapping(value = "/matieres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        matiereService.delete(id);
    }
}

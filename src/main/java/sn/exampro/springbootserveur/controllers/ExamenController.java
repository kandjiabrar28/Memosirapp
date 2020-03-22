package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Examen;
import sn.exampro.springbootserveur.entities.Utilisateur;
import sn.exampro.springbootserveur.services.ExamenService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class ExamenController {
    
    @Autowired
    private ExamenService examenService;

    @PostMapping(value = "/examens",produces = MediaType.APPLICATION_JSON_VALUE)
    public Examen createExamen(@RequestBody Examen examen){
        return examenService.create(examen);
    }
    @PutMapping(value = "/examens/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Examen update(@RequestBody Examen examen, @PathVariable Long id){
        examen.setIdexamen(id);
        return examenService.update(examen);
    }
    @GetMapping(value = "/examens",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Examen> findAll(){
        return examenService.getAll();
    }
    @DeleteMapping(value = "/examens/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        examenService.delete(id);
    }
}

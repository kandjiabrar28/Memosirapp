package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Niveau;
import sn.exampro.springbootserveur.services.NiveauService;

import java.util.Collection;
import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class NiveauController {
    @Autowired
    private NiveauService niveauService;

    @PostMapping(value = "/niveaux",produces = MediaType.APPLICATION_JSON_VALUE)
    public Niveau createUtilisateur(@RequestBody Niveau niveau){
        return niveauService.create(niveau);
    }
    @PutMapping(value = "/niveaux/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Niveau update(@RequestBody Niveau niveau, @PathVariable Long id){
        niveau.setDateModification(new Date());
        return niveauService.update(niveau);
    }
    @GetMapping(value = "/niveaux",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Niveau> findAll(){
        return niveauService.getAll();
    }
    @DeleteMapping(value = "/niveaux/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        niveauService.delete(id);
    }

}

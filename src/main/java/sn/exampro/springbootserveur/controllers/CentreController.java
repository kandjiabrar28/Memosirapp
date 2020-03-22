package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Centre;
import sn.exampro.springbootserveur.entities.Utilisateur;
import sn.exampro.springbootserveur.services.CentreService;


import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class CentreController {
    @Autowired
    private CentreService centreService;

    @PostMapping(value = "/centres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Centre createCentre(@RequestBody Centre centre){
        return centreService.create(centre);
    }
    @PutMapping(value = "/centres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Centre update(@RequestBody Centre centre, @PathVariable Long id){
        centre.setIdcentre(id);
        return centreService.update(centre);
    }
    @GetMapping(value = "/centres",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Centre> findAll(){
        return centreService.getAll();
    }
    @DeleteMapping(value = "/centres/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        centreService.delete(id);
    }
}

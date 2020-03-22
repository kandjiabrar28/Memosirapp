package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.PlageCopie;
import sn.exampro.springbootserveur.services.PlageCopieService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class PlageCopieController {
    @Autowired
    private PlageCopieService plageCopieService;

    @PostMapping(value = "/plagecopies",produces = MediaType.APPLICATION_JSON_VALUE)
    public PlageCopie createPlageCopie(@RequestBody PlageCopie plagecopie){
        return plageCopieService.create(plagecopie);
    }
    @PutMapping(value = "/plagecopies/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public PlageCopie update(@RequestBody PlageCopie plagecopie, @PathVariable Long id){
        plagecopie.setIdplage(id);
        return plageCopieService.update(plagecopie);
    }
    @GetMapping(value = "/plagecopies",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<PlageCopie> findAll(){
        return plageCopieService.getAll();
    }
    @DeleteMapping(value = "/plagecopies/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        plageCopieService.delete(id);
    }
    
}

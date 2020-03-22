package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.TAnonym;
import sn.exampro.springbootserveur.services.TAnonymService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class TAnonymController {
    @Autowired
    private TAnonymService tAnonymService;
    @PostMapping(value = "/anonymats",produces = MediaType.APPLICATION_JSON_VALUE)
    public TAnonym createUtilisateur(@RequestBody TAnonym tanonym){
        return tAnonymService.create(tanonym);
    }
    @PutMapping(value = "/anonymats/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public TAnonym update(@RequestBody TAnonym tanonym, @PathVariable Long id){
        tanonym.setIdanonym(id);
        return tAnonymService.update(tanonym);
    }
    @GetMapping(value = "/anonymats",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<TAnonym> findAll(){
        return tAnonymService.getAll();
    }
    @DeleteMapping(value = "/anonymats/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        tAnonymService.delete(id);
    }
}

package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Candidats;
import sn.exampro.springbootserveur.services.CandidatsService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class CandidatsController {
    @Autowired
    private CandidatsService candidatsService;

    @PostMapping(value = "/candidats",produces = MediaType.APPLICATION_JSON_VALUE)
    public Candidats createCandidat(@RequestBody Candidats candidats){
        return candidatsService.create(candidats);
    }
    @PutMapping(value = "/candidats/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Candidats update(@RequestBody Candidats candidats, @PathVariable Long id){
        candidats.setIduser(id);
        return candidatsService.update(candidats);
    }
    @GetMapping(value = "/candidats",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Candidats> findAll(){
        return candidatsService.getAll();
    }
    @DeleteMapping(value = "/candidats/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        candidatsService.delete(id);
    }
}

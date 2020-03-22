package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Jury;
import sn.exampro.springbootserveur.services.JuryService;


import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping
public class JuryController {
    @Autowired
    private JuryService juryService;

    @PostMapping(value = "/jurys",produces = MediaType.APPLICATION_JSON_VALUE)
    public Jury createJury(@RequestBody Jury jury){
        return juryService.create(jury);
    }
    @PutMapping(value = "/jurys/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Jury update(@RequestBody Jury jury, @PathVariable Long id){
        jury.setIdjury(id);
        return juryService.update(jury);
    }
    @GetMapping(value = "/jurys",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Jury> findAll(){
        return juryService.getAll();
    }
    @DeleteMapping(value = "/jurys/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        juryService.delete(id);
    }
}

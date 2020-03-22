package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Surveillant;
import sn.exampro.springbootserveur.services.SurveillantService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class SurveillantController {
    
    @Autowired
    private SurveillantService surveillantService;

    @PostMapping(value = "/surveillants",produces = MediaType.APPLICATION_JSON_VALUE)
    public Surveillant createSurveillant(@RequestBody Surveillant surveillant){
        return surveillantService.create(surveillant);
    }
    @PutMapping(value = "/surveillants/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Surveillant update(@RequestBody Surveillant surveillant, @PathVariable Long id){
        surveillant.setIduser(id);
        return surveillantService.update(surveillant);
    }
    @GetMapping(value = "/surveillants",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Surveillant> findAll(){
        return surveillantService.getAll();
    }
    @DeleteMapping(value = "/surveillants/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        surveillantService.delete(id);
    }
}

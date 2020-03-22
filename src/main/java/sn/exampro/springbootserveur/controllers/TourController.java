package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Tour;
import sn.exampro.springbootserveur.entities.Utilisateur;
import sn.exampro.springbootserveur.services.TourService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class TourController {
    @Autowired
    private TourService tourService;

    @PostMapping(value = "/tours",produces = MediaType.APPLICATION_JSON_VALUE)
    public Tour createTour(@RequestBody Tour tour){
        return tourService.create(tour);
    }
    @PutMapping(value = "/tours/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Tour update(@RequestBody Tour tour, @PathVariable Long id){
        tour.setNumtour(id);
        return tourService.update(tour);
    }
    @GetMapping(value = "/tours",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Tour> findAll(){
        return tourService.getAll();
    }
    @DeleteMapping(value = "/tours/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        tourService.delete(id);
    }
}

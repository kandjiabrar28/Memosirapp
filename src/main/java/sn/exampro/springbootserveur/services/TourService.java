package sn.exampro.springbootserveur.services;



import sn.exampro.springbootserveur.entities.Tour;

import java.util.Collection;

public interface TourService {
    Tour create(Tour tour);
    Tour update(Tour tour);
    Collection<Tour> getAll();
    void delete(Long id);

}

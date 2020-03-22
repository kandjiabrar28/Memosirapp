package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Tour;
import sn.exampro.springbootserveur.repositories.TourRepository;
import sn.exampro.springbootserveur.services.TourService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;
    @Override
    public Tour create(Tour tour) {
        tour.setDateCreation(new Date());
        tour.setDateModification(new Date());
        return tourRepository.save(tour);
    }

    @Override
    public Tour update(Tour tour) {
        Optional<Tour> optionalTour=tourRepository.findById(tour.getNumtour());
        if(optionalTour.isPresent()){
            tour.setDateModification(new Date());
            return tourRepository.saveAndFlush(tour);
        }
        return null;
    }

    @Override
    public Collection<Tour> getAll() {
        return tourRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Tour> optionalTour=tourRepository.findById(id);
        if(optionalTour.isPresent()){
            tourRepository.delete(optionalTour.get());
        }
    }
}


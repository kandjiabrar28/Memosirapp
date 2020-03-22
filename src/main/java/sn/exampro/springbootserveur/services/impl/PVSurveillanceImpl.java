package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.PVSurveillance;
import sn.exampro.springbootserveur.repositories.PVSurveillanceRepository;
import sn.exampro.springbootserveur.services.PVSurveillanceService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class PVSurveillanceImpl implements PVSurveillanceService {
    @Autowired
    private PVSurveillanceRepository pvSurveillanceRepository;

    @Override
    public PVSurveillance create(PVSurveillance pvSurveillance) {
        pvSurveillance.setDateCreation(new Date());
        pvSurveillance.setDateModification(new Date());
        return pvSurveillanceRepository.save(pvSurveillance);
    }

    @Override
    public PVSurveillance update(PVSurveillance pvSurveillance) {
        Optional<PVSurveillance> pvSurveillanceOptional=pvSurveillanceRepository.findById(pvSurveillance.getIdpv());
        if(pvSurveillanceOptional.isPresent()){
            pvSurveillance.setDateModification(new Date());
            pvSurveillanceRepository.saveAndFlush(pvSurveillance);
        }
        return null;
    }

    @Override
    public Collection<PVSurveillance> getAll() {
        return pvSurveillanceRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<PVSurveillance> pvSurveillanceOptional=pvSurveillanceRepository.findById(id);
        if(pvSurveillanceOptional.isPresent()){
            pvSurveillanceRepository.delete(pvSurveillanceOptional.get());
        }

    }
}

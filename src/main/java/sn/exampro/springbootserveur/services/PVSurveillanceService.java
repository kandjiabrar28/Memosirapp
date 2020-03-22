package sn.exampro.springbootserveur.services;

import sn.exampro.springbootserveur.entities.PVSurveillance;
import java.util.Collection;

public interface PVSurveillanceService {
    PVSurveillance create(PVSurveillance pvSurveillance);
    PVSurveillance update(PVSurveillance pvSurveillance);
    Collection<PVSurveillance> getAll();
    void delete(Long id);
}

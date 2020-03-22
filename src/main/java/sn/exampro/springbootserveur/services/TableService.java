package sn.exampro.springbootserveur.services;


import sn.exampro.springbootserveur.entities.Tables;
import java.util.Collection;

public interface TableService {
    Tables create(Tables tables);
    Tables update(Tables tables);
    Collection<Tables> getAll();
    void delete(Long id);

}

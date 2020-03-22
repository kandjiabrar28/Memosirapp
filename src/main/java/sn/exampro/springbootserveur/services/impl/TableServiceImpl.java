package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Tables;
import sn.exampro.springbootserveur.repositories.TableRepository;
import sn.exampro.springbootserveur.services.TableService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class TableServiceImpl implements TableService {

    @Autowired
    private TableRepository tableRepository;
    @Override
    public Tables create(Tables tables) {
        tables.setDateCreation(new Date());
        tables.setDateModification(new Date());
        return tableRepository.save(tables);
    }

    @Override
    public Tables update(Tables tables) {
        Optional<Tables> optionalTable=tableRepository.findById(tables.getIdtable());
        if(optionalTable.isPresent()){
            tables.setDateModification(new Date());
            return tableRepository.saveAndFlush(tables);
        }
        return null;
    }

    @Override
    public Collection<Tables> getAll() {
        return tableRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Tables> optionalTable=tableRepository.findById(id);
        if(optionalTable.isPresent()){
            tableRepository.delete(optionalTable.get());
        }

    }
}

package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Tables;
import sn.exampro.springbootserveur.services.TableService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class TableController {
    @Autowired
    private TableService tableService;

    @PostMapping(value = "/tables",produces = MediaType.APPLICATION_JSON_VALUE)
    public Tables createTable(@RequestBody Tables tables){
        return tableService.create(tables);
    }
    @PutMapping(value = "/tables/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Tables update(@RequestBody Tables tables, @PathVariable Long id){
        tables.setIdtable(id);
        return tableService.update(tables);
    }
    @GetMapping(value = "/tables",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Tables> findAll(){
        return tableService.getAll();
    }
    @DeleteMapping(value = "/tables/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        tableService.delete(id);
    }
}

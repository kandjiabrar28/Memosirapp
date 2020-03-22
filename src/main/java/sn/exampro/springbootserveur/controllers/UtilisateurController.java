package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Utilisateur;
import sn.exampro.springbootserveur.services.UtilisateurService;

import java.util.Collection;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @PostMapping(value = "/utilisateurs",produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.create(utilisateur);
    }
    @PutMapping(value = "/utilisateurs/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateur update(@RequestBody Utilisateur utilisateur, @PathVariable Long id){
        utilisateur.setIduser(id);
        return utilisateurService.update(utilisateur);
    }
    @GetMapping(value = "/utilisateurs",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Utilisateur> findAll(){
        return utilisateurService.getAll();
    }
    @DeleteMapping(value = "/utilisateurs/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        utilisateurService.delete(id);
    }
}

package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Session;
import sn.exampro.springbootserveur.services.SessionService;

import java.util.Collection;
import java.util.Date;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PostMapping(value = "/sessions",produces= MediaType.APPLICATION_JSON_VALUE)
    public Session createSession(@RequestBody Session session){
        return sessionService.create(session);
    }
    @PutMapping(value = "/sessions/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Session update(@RequestBody Session session,@PathVariable Long id){
        session.setDateCreation(new Date());
        return sessionService.update(session);
    }
    public Collection<Session> findAll(){
        return sessionService.getAll();
    }
    @DeleteMapping(value = "/sessions/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        sessionService.delete(id);
    }
}

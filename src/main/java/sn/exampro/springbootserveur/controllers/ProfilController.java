package sn.exampro.springbootserveur.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sn.exampro.springbootserveur.entities.Profile;
import sn.exampro.springbootserveur.services.ProfileService;

import java.util.Collection;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/decpc")
public class ProfilController {

    @Autowired
    private ProfileService profileService;

    @PostMapping(value = "/profiles",produces = MediaType.APPLICATION_JSON_VALUE)
    public Profile createProfile(@RequestBody Profile profile){
        return profileService.create(profile);
    }
    @PutMapping(value = "/profiles/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Profile update(@RequestBody Profile profile, @PathVariable Long id){
        profile.setIdprofile(id);
        return profileService.update(profile);
    }
    @GetMapping(value = "/profiles",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Profile> findAll(){
        return profileService.getAll();
    }
    @DeleteMapping(value = "/profiles/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Long id){
        profileService.delete(id);
    }
}

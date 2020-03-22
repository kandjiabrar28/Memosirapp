package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Profile;
import sn.exampro.springbootserveur.repositories.ProfileRepository;
import sn.exampro.springbootserveur.services.ProfileService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;
@Transactional
@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;
    @Override
        public Profile create(Profile profile) {
        profile.setDateCreation(new Date());
        profile.setDateModification(new Date());
        return profileRepository.save(profile);
    }

    @Override
    public Profile update(Profile profile) {
        Optional<Profile> profileOptional = profileRepository.findById(profile.getIdprofile());
        if (profileOptional.isPresent()) {
            profile.setDateCreation(new Date());
            profileRepository.saveAndFlush(profile);
        }
            return null;

    }

    @Override
    public Collection<Profile> getAll() {
        return profileRepository.findAll();
    }

    @Override
    public void delete(Long id) {
            Optional<Profile> profileOptional= profileRepository.findById(id);
            if(profileOptional.isPresent()){
                profileRepository.delete(profileOptional.get());
            }
        }


}

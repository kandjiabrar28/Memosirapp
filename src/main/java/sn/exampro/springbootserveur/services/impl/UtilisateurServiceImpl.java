package sn.exampro.springbootserveur.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.exampro.springbootserveur.entities.Utilisateur;
import sn.exampro.springbootserveur.repositories.UtilisateurRepository;
import sn.exampro.springbootserveur.services.UtilisateurService;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur create(Utilisateur utilisateur) {
        utilisateur.setDateCreation(new Date());
        utilisateur.setDateModification(new Date());
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur update(Utilisateur utilisateur) {
        Optional<Utilisateur> utilisateurOptional= utilisateurRepository.findById(utilisateur.getIduser());
        if(utilisateurOptional.isPresent()){
            utilisateur.setDateCreation(new Date());
            utilisateurRepository.saveAndFlush(utilisateur);
        }
        return null;
    }

    @Override
    public Collection<Utilisateur> getAll() {
        return utilisateurRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Utilisateur> utilisateurOptional= utilisateurRepository.findById(id);
        if(utilisateurOptional.isPresent()){
            utilisateurRepository.delete(utilisateurOptional.get());
        }

    }
}

package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue
    private Long iduser;
    private String login;
    private String pwd;
    private String email;
    private String prenom;
    private String nom;
    private String provenance;
    private String cni;
    private String telephone;
    private String sexe;
    private Date datenais;
    private String lieunais;
    private Date dateCreation;
    private Date dateModification;

    /*@ManyToOne
    private Profile profile;*/
}

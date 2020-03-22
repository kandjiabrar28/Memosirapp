package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;


import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Candidats extends Utilisateur {


    @Column(length=15)
    private String niveau;

    private Date dateCreation;
    private Date dateModification;
}

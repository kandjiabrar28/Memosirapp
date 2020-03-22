package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class PlageCopie implements Serializable {

    @Id
    @GeneratedValue
    private Long idplage;

    @Column(length=20)
    private String plage;

    private Long nbrecopie;

    @Column(length=20)
    private String typecopie;

    private Date dateCreation;
    private Date dateModification;
}

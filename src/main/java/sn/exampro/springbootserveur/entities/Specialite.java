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

@Entity @NoArgsConstructor @AllArgsConstructor @Data
public class Specialite implements Serializable {
    @Id
    @GeneratedValue
    private Long idspecialite;

    @Column(length=50)
    private String libspec;

    private Date dateCreation;
    private Date dateModification;

}

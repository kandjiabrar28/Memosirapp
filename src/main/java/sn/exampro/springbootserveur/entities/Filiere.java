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

@Entity  @NoArgsConstructor @AllArgsConstructor @Data
public class Filiere implements Serializable {

    @Id
    @GeneratedValue
    private Long idfiliere;

    @Column(length=30)
    private String libfiliere;

    private Date dateCreation;
    private Date dateModification;

}

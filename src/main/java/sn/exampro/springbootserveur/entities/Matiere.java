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
public class Matiere implements Serializable {

    @Id
    @GeneratedValue
    private Long idmatiere;

    @Column(length=30)
    private String libmatiere;

    @Column(name="NE")
    private double noteelimin;

    @Column(name="coef")
    private double coefficient;

    private Date dateCreation;
    private Date dateModification;
}

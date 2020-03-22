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
public class PVSurveillance implements Serializable {

    @Id
    @GeneratedValue
    private Long idpv;

    private Date heureDeb;

    private Date heureFin;

    private Date date;

    @Column(length=30)
    private String epreuve;

    private Date dateCreation;
    private Date dateModification;
}

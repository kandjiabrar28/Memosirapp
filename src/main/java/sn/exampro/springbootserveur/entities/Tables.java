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
public class Tables implements Serializable {

    @Id
    @GeneratedValue
    private Long idtable;

    private Long numtable;

    private Date dateCreation;
    private Date dateModification;
}

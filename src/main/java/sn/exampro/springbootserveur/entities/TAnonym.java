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
public class TAnonym implements Serializable {

    @Id
    @GeneratedValue
    private Long idanonym;

    @Column(length=8)
    private String numanonym;

    private Date dateCreation;
    private Date dateModification;
}

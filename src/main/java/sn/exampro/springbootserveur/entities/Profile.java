package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Profile implements Serializable {
   @Id
   @GeneratedValue
    private Long idprofile;
    private String fonction;
    private Date dateCreation;
    private Date dateModification;


}

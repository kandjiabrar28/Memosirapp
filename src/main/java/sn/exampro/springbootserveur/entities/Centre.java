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

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Centre implements Serializable {
    @Id
    @GeneratedValue
    private Long idcentre ;

    @Column(length=50)
    private String nom;

    @Column(length=20)
    private String region;

    @Column(length=20)
    private String departement;

    @Column(length=16)
    private String telephone;

    @Column(length=30)
    private String email;

    private Date dateCreation;
    private Date dateModification;
}

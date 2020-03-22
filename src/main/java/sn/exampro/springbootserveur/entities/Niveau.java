package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Entity @AllArgsConstructor
@NoArgsConstructor @Data
public class Niveau implements Serializable {

    @Id
    @GeneratedValue
    private Long idniveau;

    @Column(length=10)
    private String libniveau;

    private Date dateCreation;
    private Date dateModification;
}

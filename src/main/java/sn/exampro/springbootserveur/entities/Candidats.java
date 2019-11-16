package sn.exampro.springbootserveur.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidats extends Utilisateur{
	
	   @Id @GeneratedValue
	   private Long idcandidat;
	   
	  
	   @Column(length=15)
	   private String niveau;

	
	

	

}

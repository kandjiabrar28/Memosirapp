package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle implements Serializable{
	
	 @Id @GeneratedValue
	 
	   private Long idsalle;
	  
	   private Long numsalle;
	   
	   @Column(length=25)
	   private String nomsalle;


}

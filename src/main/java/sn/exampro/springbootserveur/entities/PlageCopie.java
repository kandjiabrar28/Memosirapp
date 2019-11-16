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
public class PlageCopie implements Serializable{
	
	@Id @GeneratedValue
	   private Long idplage;
	  
	@Column(length=20)   
	private String plage;
	  
	private Long nbrecopie;
	 
	@Column(length=20)
	private String typecopie;



}

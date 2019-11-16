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
public class Surveillant extends Utilisateur{
	
	@Id @GeneratedValue
	private Long idsurveillant;
	
	@Column(length=25) 
	private String fonction;



}

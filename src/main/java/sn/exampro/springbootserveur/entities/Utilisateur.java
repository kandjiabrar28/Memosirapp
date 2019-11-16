package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable{
	
	   @Id @GeneratedValue
	   private int iduser;
	  
	   @Column(length=30)
	   private String login;
	  
	   @Column(length=255)
	   private String pwd;
	  
	   @Column(length=30)
	   private String email;
	 
	   @Column(length=35)
	   private String prenom;
	  
	   @Column(length=25)
	   private String nom;
	 
	   @Column(length=35)
	   private String provenance;
	  
	   @Column(length=20)
	   private String cni;
	  
	   @Column(length=20)
	   private String telephone;
	  
	   @Column(length=8)
	   private String sexe;
	   
	   private Date datenais;
	   
	   @Column(length=25)
	   private String lieunais;



}

package sn.exampro.springbootserveur.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TAnonym implements Serializable{
	 
	@Id @GeneratedValue
	private Long idanonym;
	
	@Column(length=8)
	private String numanonym;



}

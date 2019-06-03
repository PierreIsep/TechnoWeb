package com.isep.miga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="reclamation")
public class Reclamation {
	@Id
	@GeneratedValue
	private int id;
	@NotBlank
	private String titre;
	@NotBlank
	private String description;
	
	@Value(value = "0")
	private int nombre_vote;
	
	
	public Reclamation() {
		
	}
	
	public Reclamation(int id) {
		this.id = id;
	}
	
	public Reclamation(int id, @NotBlank String titre, @NotBlank String description, @NotBlank int nombre_vote) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.nombre_vote = nombre_vote;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNombre_vote() {
		return nombre_vote;
	}
	public void setNombre_vote(int nombre_vote) {
		this.nombre_vote = nombre_vote;
	}
	

}

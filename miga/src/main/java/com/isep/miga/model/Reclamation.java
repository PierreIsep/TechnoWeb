package com.isep.miga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
	@NotBlank
	private int number_vote;
	
	
	
	
	public Reclamation(int id, @NotBlank String titre, @NotBlank String description, @NotBlank int number_vote) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.number_vote = number_vote;
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
	public int getNumber_vote() {
		return number_vote;
	}
	public void setNombre_vote(int nombre_vote) {
		this.number_vote = number_vote;
	}
	

}

package com.isep.miga.model;

import javax.persistence.*;

@Entity
@Table(name = "vote")
public class Vote {
    @Id
    @GeneratedValue	
	private int id;
    
    private int id_Reclamation;

    
    public Vote() {
    	
    }
    
    
	public Vote(int id, int id_Reclamation) {
		super();
		this.id = id;
		this.id_Reclamation = id_Reclamation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Reclamation() {
		return id_Reclamation;
	}

	public void setId_Reclamation(int id_Reclamation) {
		this.id_Reclamation = id_Reclamation;
	}
    





}
package com.isep.miga.dao;

public class Identifiant {
	public String identifiant;
	public String mdp;
	
	
	
	public Identifiant(String identifiant, String mdp) {
		this.identifiant = identifiant;
		this.mdp = mdp;
	}
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	
}

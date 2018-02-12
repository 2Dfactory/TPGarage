package com.tpgarage.classes.moteur;

import java.io.Serializable;

import com.tpgarage.enumeration.TypeMoteur;

public class Moteur implements Serializable{

	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	public Moteur() {
		
	}
	
	public Moteur(String cylindre, Double prix) {
		super();
		this.cylindre = cylindre;
		this.prix = prix;
	}

	public String getCylindre() {
		return cylindre;
	}

	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Moteur [type=" + type + ", cylindre=" + cylindre + ", prix=" + prix + "]";
	}
	
}

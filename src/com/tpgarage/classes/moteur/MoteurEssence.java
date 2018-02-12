package com.tpgarage.classes.moteur;

import com.tpgarage.enumeration.TypeMoteur;

public class MoteurEssence extends Moteur{

	public MoteurEssence() {
		// TODO Auto-generated constructor stub
	}
	
	public MoteurEssence(String cylindre, Double prix) {
		super();
		this.type = TypeMoteur.ESSENCE;
		this.cylindre = cylindre;
		this.prix = prix;
	}

}

package com.tpgarage.classes.moteur;

import com.tpgarage.enumeration.TypeMoteur;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel() {
		// TODO Auto-generated constructor stub
	}

	public MoteurDiesel(String cylindre, Double prix) {
		super();
		this.type = TypeMoteur.DIESEL;
		this.cylindre = cylindre;
		this.prix = prix;
	}

}

package com.tpgarage.classes.moteur;

import com.tpgarage.enumeration.TypeMoteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique() {
		// TODO Auto-generated constructor stub
	}

	public MoteurElectrique(String cylindre, Double prix) {
		super();
		this.type = TypeMoteur.ELECTRIQUE;
		this.cylindre = cylindre;
		this.prix = prix;
	}

}

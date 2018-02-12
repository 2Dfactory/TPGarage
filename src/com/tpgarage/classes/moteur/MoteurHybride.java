package com.tpgarage.classes.moteur;

import com.tpgarage.enumeration.TypeMoteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride() {
		// TODO Auto-generated constructor stub
	}

	public MoteurHybride(String cylindre, Double prix) {
		super();
		this.type = TypeMoteur.HYBRIDE;
		this.cylindre = cylindre;
		this.prix = prix;
	}

}

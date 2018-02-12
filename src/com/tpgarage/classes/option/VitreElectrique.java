package com.tpgarage.classes.option;

import com.tpgarage.interfaces.Option;

public class VitreElectrique implements Option {

	protected double prix = 212.35;
	
	public VitreElectrique() {
	}

	@Override
	public double getPrix() {
		return this.prix;
	}

	public String toString() {
		return "Vitres électriques";
	}
}

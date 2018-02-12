package com.tpgarage.classes.option;

import java.io.Serializable;

import com.tpgarage.interfaces.Option;

public class VitreElectrique implements Option, Serializable {

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

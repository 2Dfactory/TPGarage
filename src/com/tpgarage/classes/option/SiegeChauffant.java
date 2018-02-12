package com.tpgarage.classes.option;

import com.tpgarage.interfaces.Option;

public class SiegeChauffant implements Option {

	protected double prix = 562.9;
	
	public SiegeChauffant() {
	}

	@Override
	public double getPrix() {
		return this.prix;
	}

	public String toString() {
		return "Sièges chauffants";
	}
}

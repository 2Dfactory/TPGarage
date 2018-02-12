package com.tpgarage.classes.option;

import java.io.Serializable;

import com.tpgarage.interfaces.Option;

public class SiegeChauffant implements Option, Serializable {

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

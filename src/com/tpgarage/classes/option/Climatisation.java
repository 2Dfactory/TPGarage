package com.tpgarage.classes.option;

import java.io.Serializable;

import com.tpgarage.interfaces.Option;

public class Climatisation implements Option, Serializable {

	protected double prix = 347.3;
	
	public Climatisation() {
	}

	@Override
	public double getPrix() {
		return this.prix;
	}

	public String toString() {
		return "Climatisation";
	}
}

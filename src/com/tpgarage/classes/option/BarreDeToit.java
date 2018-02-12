package com.tpgarage.classes.option;

import java.io.Serializable;

import com.tpgarage.interfaces.Option;

public class BarreDeToit implements Option, Serializable {

	protected double prix = 29.9;
	
	public BarreDeToit() {
	}

	@Override
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return "Barre de toit";
	}

}

package com.tpgarage.classes.option;

import java.io.Serializable;

import com.tpgarage.interfaces.Option;

public class GPS implements Option, Serializable {

	protected double prix = 113.5;
	
	public GPS() {

	}

	@Override
	public double getPrix() {
		return this.prix;
	}
	
	public String toString() {
		return "GPS";
	}

}

package com.tpgarage.classes.option;

import com.tpgarage.interfaces.Option;

public class Climatisation implements Option {

	protected double prix = 347.3;
	
	public Climatisation() {
	}

	@Override
	public double getPrix() {
		return this.prix;
	}

}

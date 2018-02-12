package com.tpgarage.classes.option;

import com.tpgarage.interfaces.Option;

public class GPS implements Option {

	protected double prix = 113.5;
	
	public GPS() {

	}

	@Override
	public double getPrix() {
		return this.prix;
	}

}

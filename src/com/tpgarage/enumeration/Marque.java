package com.tpgarage.enumeration;

public enum Marque {
	
	//Objets 
	RENO("RENO"),
	PIGEOT("PIGEOT"),
	TROEN("TROEN");
	
	private String marque;
	
	Marque(String marque){
		this.marque = marque;
	}
	
	public String toString(){
		return marque;
	}
	
}

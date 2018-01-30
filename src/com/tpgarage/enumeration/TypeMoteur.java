package com.tpgarage.enumeration;

public enum TypeMoteur {

	//Objets 
	DIESEL("DIESEL"),
	ESSENCE("ESSENCE"),
	HYBRIDE("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	private String typeMoteur;
	
	TypeMoteur(String typeM){
		this.typeMoteur = typeM;
	}
	
	public String toString(){
		return typeMoteur;
	}
	
}

package com.tpgarage.general;

import java.util.ArrayList;
import java.util.List;

import com.tpgarage.classes.vehicules.Vehicule;

public class Garage {
	
	protected List<Vehicule> voitures = new ArrayList<Vehicule>();
	private String repertoireDatabase = "";
	
	
	public Garage() {
		contenuGarage();
	}
	
	public void addVoiture(Vehicule voiture) {
		this.voitures.add(voiture);
	}
	
	
	private void contenuGarage(){
		//TODO initialise la liste de v�hicule du garage
		
		List<Vehicule> liste = new ArrayList<Vehicule>();
		
		
		this.voitures = liste;
	}
	
	//V�rifie si la database est vide
	private boolean isEmpty() {
		//TODO test du contenu du r�pertoire de sauvegarde
		
		
		
		return true;
	}
	

}

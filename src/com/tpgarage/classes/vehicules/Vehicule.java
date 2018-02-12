package com.tpgarage.classes.vehicules;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tpgarage.classes.moteur.Moteur;
import com.tpgarage.enumeration.Marque;
import com.tpgarage.interfaces.Option;

public class Vehicule implements Serializable {
	
	protected double prix = 0.0;
	protected String nom = "Pas de nom";
	protected List<Option> options = new ArrayList<Option>();
	protected Marque nomMarque = null;
	protected Moteur moteur = null;
	
	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public Vehicule() {}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}

	/**
	 * This method calculates the total price of the vehicle
	 * @return a Double
	 */
	protected double calculPrixV() {
		
		double prixTot = this.prix;
		
		if(this.moteur != null) prixTot += this.moteur.getPrix();
		
		if(!options.isEmpty()) {
			for (Option opt : options) {
				prixTot += opt.getPrix();
			}
		}
		
		return prixTot;
		
	}
	
	@Override
	public String toString() {
		
		String str ="Voiture ";
		
		if(this.nomMarque != null) str += this.nomMarque;
		else str += " Pas de marque ";
		
		str += " : " + this.nom;
		
		if(this.moteur != null) str += " Moteur " + this.moteur.getTypeMoteur() + " " + this.moteur.getCylindre() + "(" + this.moteur.getPrix() + "€) ";
		else str += " Pas de moteur ";
		
		str += "[";
		
		if(options.isEmpty()) {
			str += " Pas d'options ";
		} else {
			for (Option opt : options) {
				
				if(opt == options.get(options.size()-1)) str += opt.toString() + "(" + opt.getPrix() + "€)";
				else str += opt.toString() + "(" + opt.getPrix() + "€), ";
			}
		}
		
		str += "] d'une valeur totale de " + calculPrixV() + "€";
		
		/*
			return "Voiture " + this.nomMarque + " : " + this.nom + 
				" Moteur " + this.moteur.getTypeMoteur() + " " + this.moteur.getCylindre() + "(" + this.moteur.getPrix() + "€) " + str + 
				" d'une valeur totale de " + calculPrixV() + "€";
		//*/
		
		return str;
		
	}
	
	
	

}

package com.tpgarage.classes.vehicules;

import java.util.List;

import com.tpgarage.enumeration.Marque;
import com.tpgarage.interfaces.Option;

public class Vehicule {
	
	protected double prix;
	protected String nom;
	protected List<Option> options = null;
	protected Marque nomMarque;
	
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

	public void setNom(String nom) {
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Vehicule [prix=" + prix + ", nom=" + nom + ", options=" + options + ", nomMarque=" + nomMarque + "]";
	}
	
	
	

}

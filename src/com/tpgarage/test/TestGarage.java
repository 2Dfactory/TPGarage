package com.tpgarage.test;

import com.tpgarage.classes.moteur.MoteurDiesel;
import com.tpgarage.classes.moteur.MoteurElectrique;
import com.tpgarage.classes.moteur.MoteurEssence;
import com.tpgarage.classes.moteur.MoteurHybride;
import com.tpgarage.classes.option.BarreDeToit;
import com.tpgarage.classes.option.Climatisation;
import com.tpgarage.classes.option.GPS;
import com.tpgarage.classes.option.SiegeChauffant;
import com.tpgarage.classes.option.VitreElectrique;
import com.tpgarage.classes.vehicules.A300B;
import com.tpgarage.classes.vehicules.D4;
import com.tpgarage.classes.vehicules.Lagouna;
import com.tpgarage.classes.vehicules.Vehicule;
import com.tpgarage.enumeration.Marque;
import com.tpgarage.general.Garage;

public class TestGarage {

	public static void main(String[] args) {

		Garage garage = new Garage();
		
		//Remplacer true par false dans la condition pour arrêter la suppression du contenu du garage
		if(true) garage.clearGarage();
		
		System.out.println(garage);
		
		//Remplacer false par true dans la condition pour pouvoir ajouter les véhicules ci-dessous au garage
		if(false) {
			
			//Création d'un véhicule
			Vehicule lag1 = new Lagouna();
			lag1.setNomMarque(Marque.RENO);
			lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
			lag1.addOption(new GPS());
		   	lag1.addOption(new SiegeChauffant());
		   	lag1.addOption(new VitreElectrique());
		   	garage.addVoiture(lag1);
		   		 
		   	Vehicule A300B_2 = new A300B();
		   	A300B_2.setNomMarque(Marque.PIGEOT);
		   	A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		   	A300B_2.addOption(new Climatisation());
		   	A300B_2.addOption(new BarreDeToit());
		   	A300B_2.addOption(new SiegeChauffant());
		   	garage.addVoiture(A300B_2);
		   	 
		   	Vehicule d4_1 = new D4();
		   	d4_1.setNomMarque(Marque.TROEN);
		   	d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		   	d4_1.addOption(new BarreDeToit());
		   	d4_1.addOption(new Climatisation());
		   	d4_1.addOption(new GPS());
		   	garage.addVoiture(d4_1);   	 
		   	
		   	Vehicule lag2 = new Lagouna();
		   	lag2.setNomMarque(Marque.RENO);
		   	lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		   	garage.addVoiture(lag2);
		   	
		   	Vehicule A300B_1 = new A300B();
		   	A300B_1.setNomMarque(Marque.PIGEOT);
		   	A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		   	A300B_1.addOption(new VitreElectrique());
		   	A300B_1.addOption(new BarreDeToit());
		   	garage.addVoiture(A300B_1);
		   	
		   	Vehicule d4_2 = new D4();
		   	d4_2.setNomMarque(Marque.TROEN);
		   	d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		   	d4_2.addOption(new SiegeChauffant());
		   	d4_2.addOption(new BarreDeToit());
		   	d4_2.addOption(new Climatisation());
		   	d4_2.addOption(new GPS());
		   	d4_2.addOption(new VitreElectrique());
		   	garage.addVoiture(d4_2);
			
		}

	}

}

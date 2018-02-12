package com.tpgarage.test;

import com.tpgarage.classes.moteur.MoteurDiesel;
import com.tpgarage.classes.option.BarreDeToit;
import com.tpgarage.classes.option.Climatisation;
import com.tpgarage.classes.option.GPS;
import com.tpgarage.classes.option.SiegeChauffant;
import com.tpgarage.classes.option.VitreElectrique;
import com.tpgarage.classes.vehicules.Lagouna;
import com.tpgarage.classes.vehicules.Vehicule;
import com.tpgarage.enumeration.Marque;
import com.tpgarage.general.Garage;

public class TestGarage {

	public static void main(String[] args) {

		Garage g1 = new Garage();
		
		Vehicule v1 = new Lagouna();
		
		v1.setNomMarque(Marque.RENO);
		v1.setMoteur(new MoteurDiesel("2.0 HDI", 1000.51));
		v1.setPrix(9999.99);
		v1.addOption(new GPS());
		v1.addOption(new VitreElectrique());
		v1.addOption(new SiegeChauffant());
		v1.addOption(new BarreDeToit());
		v1.addOption(new Climatisation());
		
		g1.addVoiture(v1);
		
		for(int i = 0; i < g1.listOfVehicle().size(); i++) {
			System.out.println(g1.listOfVehicle().get(i));
		}
		
		
	}

}

package com.tpgarage.test;

import com.tpgarage.classes.moteur.MoteurDiesel;
import com.tpgarage.classes.moteur.MoteurElectrique;
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

public class TestVoiture {
	
	public static void main(String[] args) {
		
		Vehicule v1 = new Lagouna();
		Vehicule v2 = new D4();
		Vehicule v3 = new A300B();
		
		v1.setPrix(10000.00);
		v1.setMoteur(new MoteurDiesel("2.0 HDI", 1000.2));
		v1.setNomMarque(Marque.PIGEOT);
		v1.addOption(new GPS());
		v1.addOption(new Climatisation());
		
		v2.setMoteur(new MoteurElectrique("100kW", 2000.4));
		v2.setNomMarque(Marque.RENO);
		v2.addOption(new VitreElectrique());
		v2.addOption(new SiegeChauffant());
		v2.addOption(new BarreDeToit());
		
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}

}

package com.tpgarage.general;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tpgarage.classes.vehicules.Vehicule;

public class Garage {
	
	protected List<Vehicule> voitures = new ArrayList<Vehicule>();
	private String repertoireDatabase = "./databaseGarage";
	
	
	public Garage() {
		createDirectory();
		initGarageDb();
	}
	
	/**
	 * This method clear the content of the database
	 */
	public void clearGarage() {
		
		this.voitures = new ArrayList<Vehicule>();
		
		for(String path : listOfVehicle()) {
			
			File f = new File(repertoireDatabase + "/" + path);
			if(f.delete()) System.err.println(path + " : deleted !");
		}
		
	}
	
	/**
	 * This method create the directory where the vehicles will be saved
	 */
	private void createDirectory() {
		
		File repertoire = new File(repertoireDatabase);
		//Test si le répertoire existe et le crée s'il n'existe pas
		if(!repertoire.exists()) repertoire.mkdir();
		
	}
	
	/**
	 * This method add a vehicle in the garage list of vehicle and serialize the vehicle object
	 * @param voiture
	 */
	public void addVoiture(Vehicule voiture) {
		
		String dbFileVehicule = "/voiture";
		
		//Ajout du véhicule dans la liste du garage
		this.voitures.add(voiture);
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File(repertoireDatabase + dbFileVehicule + (quantityOfVehicle()+1) + ".ser"))));
			
			//Serialisation du véhicule
			oos.writeObject(voiture);	
			
			//Fermeture du flux
			oos.close();
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This method read the saved and serialized vehicles in the directory 
	 */
	private void initGarageDb(){
		
		//Test si la database véhicule est vide
		if(this.isEmpty()) {
			
			ObjectInputStream ois = null;
			
			try {
				
				//Boucle parcourant l'ensemble des véhicules sérialisés
				for(String vehicle : listOfVehicle()) {
					
					ois = new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(
											new File(repertoireDatabase+"/"+vehicle))));
					
					try {
						
						//Désérialisation de chaque véhicule sauvegarder et ajout dans la liste du garage
						voitures.add((Vehicule)ois.readObject());
						
					} catch (ClassNotFoundException cnfe) {
						cnfe.printStackTrace();
					}
					
					//Fermeture du flux
					ois.close();
				}
				
			} catch(FileNotFoundException fnfe) {
				fnfe.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
					
		}
		
	}
	
	/**
	 * This method check if the database is empty or not.
	 * Return false if the database is empty.
	 * Return true if the database is not empty.
	 * @return
	 */
	private boolean isEmpty() {

		if(quantityOfVehicle() == -1) return false;
		if(quantityOfVehicle() == 0) return false;
				
		return true;
		
	}
	
	/**
	 * This method return the quantity of vehicle in the database
	 * @return
	 */
	private int quantityOfVehicle() {
		
		List<String> list = listOfVehicle();
		
		if(list == null) return -1;
		
		return list.size();
		
	}
	
	/**
	 * This method return the list of saved vehicles in the database
	 * @return
	 */
	private List<String> listOfVehicle() {
		
		List<String> listOfV = new LinkedList<>();
		
		File repertoire = new File(repertoireDatabase);
		File[] liste = repertoire.listFiles();
		
		if(liste == null) return null;
		
		for(File file : liste) {
			listOfV.add(file.getName());
		}
		
		return listOfV;
		
	}

	@Override
	public String toString() {
		
		String str = "";
		
		if(voitures.isEmpty()) return "Aucune voiture sauvegardée !\n"
				+ "***************************\n"
				+ "*  Garage OpenClassrooms  *\n"
				+ "***************************\n";
		
		for(Vehicule v : voitures) {
			str += v + "\n";
		}
		
		return str;
	}
	
	

}

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
	private String repertoireDatabase = "C:\\Users\\Andr� GUENEY\\git\\TPGarage\\databaseGarage";
	
	
	public Garage() {
		initGarageDb();
	}
	
	/**
	 * This method add a vehicle in the garage list of vehicle and serialize the vehicle object
	 * @param voiture
	 */
	public void addVoiture(Vehicule voiture) {
		
		String dbFileVehicule = "/voiture";
		
		this.voitures.add(voiture);
		
		System.out.println(voiture.toString());
		System.out.println(quantityOfVehicle());
		System.out.println(dbFileVehicule + (quantityOfVehicle()+1) + ".ser");
		
		
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File(repertoireDatabase + dbFileVehicule + (quantityOfVehicle()+1) + ".ser"))));
			oos.writeObject(voiture);	
			
			oos.close();
			
		}
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private void initGarageDb(){
		//TODO initialise la liste de v�hicule du garage
		
		if(this.isEmpty()) {
			
			ObjectInputStream ois = null;
			
			try {
				
				for(String vehicle : listOfVehicle()) {
					
					ois = new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(
											new File(repertoireDatabase+"/"+vehicle))));
					
					try {
						
						voitures.add((Vehicule)ois.readObject());
						
					} catch (ClassNotFoundException cnfe) {
						cnfe.printStackTrace();
					}
					
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
	public boolean isEmpty() {

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
	 * This method return the liste of saved vehicles in the database
	 * @return
	 */
	public List<String> listOfVehicle() {
		
		List<String> listOfV = new LinkedList<>();
		
		File repertoire = new File(repertoireDatabase);
		File[] liste = repertoire.listFiles();
		
		if(liste == null) return null;
		
		for(File file : liste) {
			listOfV.add(file.getName());
		}
		
		return listOfV;
		
	}
	

}

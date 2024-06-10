package com.betacom.car.singletone;

import java.util.ArrayList;
import java.util.List;

import com.betacom.car.oggetti.Veicolo;

public class MySingleTone {
	
	private static MySingleTone instance = null;
	
	private List<Veicolo> listV = new ArrayList<Veicolo>();
	private final String[] tipoMacchina = {"Fouristada", "City", "Sportiva", "Utilitaria"}; 
	private final String[] tipoMoto = {"Strada", "Cross", "Trial", "Scooter"}; 
	
	
	private  Integer id = 0; 
	
	private MySingleTone() {
	}
	
	public static MySingleTone getInstance() {
		if (instance == null) {
			instance = new MySingleTone();
			System.out.println("new instance");
		}
		return instance;
	}
	
	public Integer getID() {
		id++;
		return id;
	}
	
	public boolean controlTipoMacchina(String tipoVehicolo,String tipo) {
		boolean rc = false;
		if ("Macchina".equalsIgnoreCase(tipoVehicolo)) {
			rc = searchValue(tipoMacchina, tipo);
		}
		if ("Moto".equalsIgnoreCase(tipoVehicolo)) {
			rc = searchValue(tipoMoto, tipo);
		}
		
		return rc;

		
		
	}
		
	private boolean searchValue(String[] table, String tipo) {
		boolean rc = false;
		for (String ti    :table) {
			if (ti.equalsIgnoreCase(tipo))
				rc=true;
		}
		return rc;
	}
		
	
	public void updateList(Veicolo obj) {
		listV.add(obj);
		System.out.println("Object has been added...." + obj.getId());
	}

	public boolean removeItem(Integer id) {
		boolean rc = false;
		for (Veicolo it:listV) {
			if (it.getId() == id) {
				listV.remove(it);
				rc = true;
				break;
			}
		}
		if (rc)
			System.out.println("Object has been removed....");
		return rc;
	}


	public Veicolo getItem(Integer id) {
		for (Veicolo it:listV) {
			if (it.getId() == id) {
				return it;
			}
		}
		return null;
	}

	public void displayList() {
		System.out.println("*****  numero veicolo totale :" + listV.size());
		for (Veicolo it: listV) {
			System.out.println("id:" + it.getId() +  " dataInserimento:" + it.getDataInserimento() );
			
		}
		
		
	}

}

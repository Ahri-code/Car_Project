package com.betacom.car;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.service.implementation.GestioneBici;
import com.betacom.car.service.implementation.GestioneMacchina;
import com.betacom.car.service.implementation.GestioneSystem;
import com.betacom.car.service.implementation.GestrionMoto;
import com.betacom.car.service.intefaces.IGestioneSystem;
import com.betacom.car.service.intefaces.IGestioneVeicolo;
import com.betacom.car.singletone.MySingleTone;

public class 	Main {
	private static IGestioneVeicolo gM = new GestioneMacchina();
	private static IGestioneVeicolo gMoto = new GestrionMoto();
	private static IGestioneVeicolo gB = new GestioneBici();
	private static IGestioneSystem gS = (IGestioneSystem) new GestioneSystem();

	public static void main(String[] args) {
		
		Macchina paramCar = new Macchina();
		paramCar.setNumeroPorte(4);
		paramCar.setTipoVeicolo("City");
		
		Macchina mac = null;
		mac =  createMacchina(paramCar);
		
		paramCar = new Macchina();
		paramCar.setNumeroPorte(4);
		paramCar.setNumeroRuote(4);
		paramCar.setTipoVeicolo("Sportiva");
		mac =  createMacchina(paramCar);

		
		paramCar = new Macchina();
		paramCar.setNumeroPorte(4);
		paramCar.setNumeroRuote(4);
		paramCar.setTipoVeicolo("Utilitaria");
		mac =  createMacchina(paramCar);

		paramCar = new Macchina();
		paramCar.setNumeroPorte(4);
		paramCar.setNumeroRuote(4);
		mac =  createMacchina(paramCar);

		
		Macchina.statistiche();
	
		
		Moto paramMoto = new Moto();
		paramMoto.setCc(250);
		paramMoto.setNumeroRuote(2);
		paramCar.setTipoVeicolo("Scooter");
		paramMoto.setColore("Rossa");
		
		Moto motoR = createMoto(paramMoto);

		Moto.statistiche();
		
		System.out.println("***** G E T **********");
		
		
		paramCar = getMacchina(1);
		System.out.println("get  id:" + paramCar.getId() +  " dataInserimento:" + paramCar.getDataInserimento() );
		
		
		try {
			gS.displayList();
		} catch (AcademyException e) {
			System.out.println("Errore stampa lista");
		}
		System.out.println("***********************");
		
		removeMacchina(2);
		try {
			gS.displayList();
		} catch (AcademyException e) {
			System.out.println("Errore stampa lista");
		}

		removeMacchina(4);
		try {
			gS.displayList();
		} catch (AcademyException e) {
			System.out.println("Errore stampa lista");
		}

		removeMacchina(25);

		
	}
	
	
	
	
	private static  Macchina createMacchina(Macchina paramCar) {
		Macchina mac = null;
		try {
			mac = (Macchina)gM.createVeicolo(paramCar);
	
		} catch (AcademyException e) {
			System.out.println("Error:" + e.getMessage());
		} finally {
		}
		return mac;
	}

	private static void removeMacchina(Integer id) {
		Macchina mac = null;
		try {
			 gM.removeVeicolo(id);;
			
		} catch (AcademyException e) {
			System.out.println("Error:" + e.getMessage());
		} finally {
		}
	}

	private static Macchina getMacchina(Integer id) {
		Macchina mac = null;
		try {
			 mac = (Macchina)gM.getVeicolo(id);
			
		} catch (AcademyException e) {
			System.out.println("Error:" + e.getMessage());
		} finally {
		}
		return mac;
	}

	private static  Moto createMoto(Moto paramCar) {
		Moto mo = null;
		try {
			mo = (Moto)gMoto.createVeicolo(paramCar);
	
		} catch (AcademyException e) {
			System.out.println("Error:" + e.getMessage());
		} finally {
		}
		return mo;
	}

	
	
}

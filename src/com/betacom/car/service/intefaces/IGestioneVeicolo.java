package com.betacom.car.service.intefaces;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Veicolo;

public interface IGestioneVeicolo {
	
	Veicolo createVeicolo(Veicolo params) throws  AcademyException;
	void removeVeicolo(Integer id) throws  AcademyException;
	Veicolo getVeicolo(Integer id) throws  AcademyException;
	
}

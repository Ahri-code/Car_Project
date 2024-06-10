package com.betacom.car.service.implementation;

import java.util.Date;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Moto;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.service.intefaces.IGestioneSystemService;
import com.betacom.car.service.intefaces.IGestioneVeicolo;

public class GestrionMoto implements IGestioneVeicolo{

	private IGestioneSystemService gS = new GestioneSystemService();

	@Override
	public Veicolo createVeicolo(Veicolo params) throws  AcademyException {
		Moto param = (Moto)params;
		if (param.getNumeroRuote() == null) {
			Veicolo.numeroErrori++;
			throw new AcademyException("Numero ruote obbligatorio");
		}
		
		if (!gS.controlloTipoMacchina("Moto",param.getTipoVeicolo()))
			throw new AcademyException("Tipo moto invalida");

		
		param.setDataInserimento(new Date());
		
		Moto.numeroMoto++;
		param.setId(gS.getId());
		
		gS.updateList(param);
		
		
		return param;
	}

	@Override
	public void removeVeicolo(Integer id) throws AcademyException {
		Veicolo v = getVeicolo(id);
		if (v instanceof Macchina) {
			if (!gS.removeItem(id))
				throw new AcademyException("ID non trovata per remove");
		} else {
			throw new AcademyException("ID non é una macchina");
		}
		
	}

	@Override
	public Veicolo getVeicolo(Integer id) throws AcademyException {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.betacom.car.service.implementation;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Bici;
import com.betacom.car.oggetti.Macchina;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.service.intefaces.IGestioneSystemService;
import com.betacom.car.service.intefaces.IGestioneVeicolo;

import java.util.Date;

public class GestioneBici implements IGestioneVeicolo{

	private IGestioneSystemService gS = new GestioneSystemService();

	@Override
	public Veicolo createVeicolo(Veicolo params) throws  AcademyException{
		Bici param =(Bici)params;

		if (param.getNumeroRuote() == null) {
			Veicolo.numeroErrori++;
			throw new AcademyException("Numero ruote obbligatorio");
		}

		param.setDataInserimento(new Date());

		Bici.numeroBici++;
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
		Veicolo ret = gS.getItem(id);
		if (ret == null)
			throw new AcademyException("ID non trovata");
		return ret;
	}

}

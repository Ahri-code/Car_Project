package com.betacom.car.service.implementation;

import com.betacom.car.exception.AcademyException;
import com.betacom.car.oggetti.Veicolo;
import com.betacom.car.service.intefaces.IGestioneSystemService;
import com.betacom.car.singletone.MySingleTone;

public class GestioneSystemService implements IGestioneSystemService {


    @Override
    public boolean controlloTipoMacchina(String tipoVeicolo, String tipo) {
        return MySingleTone.getInstance().controlTipoMacchina(tipoVeicolo, tipo);
    }

    @Override
    public void updateList(Veicolo obj) {
        MySingleTone.getInstance().updateList(obj);
    }

    @Override
    public boolean removeItem(Integer id) {
        return MySingleTone.getInstance().removeItem(id);
    }

    @Override
    public Veicolo getItem(Integer id) {
        return MySingleTone.getInstance().getItem(id);
    }

    @Override
    public Integer getId() {
        return MySingleTone.getInstance().getID();
    }

    @Override
    public void displayList() throws AcademyException {

    }
}

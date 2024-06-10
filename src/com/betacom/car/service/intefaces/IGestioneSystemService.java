package com.betacom.car.service.intefaces;

import com.betacom.car.oggetti.Veicolo;

public interface IGestioneSystemService extends IGestioneSystem {

    boolean controlloTipoMacchina(String tipoVeicolo, String tipo);
    void updateList(Veicolo obj);
    boolean removeItem(Integer id);
    Veicolo getItem(Integer id);
    Integer getId();

}

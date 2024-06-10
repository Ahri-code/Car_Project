package com.betacom.car.service.implementation;

import com.betacom.car.service.intefaces.IGestioneSystem;
import com.betacom.car.singletone.MySingleTone;

public class GestioneSystem implements IGestioneSystem {
    public void displayList() {
        MySingleTone.getInstance().displayList();
    }
}

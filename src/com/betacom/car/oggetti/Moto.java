package com.betacom.car.oggetti;

public class Moto extends Veicolo{
	private String numeroTarga;
	private Integer cc;

	public static  int  numeroMoto;

	public static void statistiche() {
		System.out.printf("..... Moto create %d , errori creazione macchina %d  \n", numeroMoto, numeroErrori);
	}

	public String getNumeroTarga() {
		return numeroTarga;
	}
	public void setNumeroTarga(String numeroTarga) {
		this.numeroTarga = numeroTarga;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
}

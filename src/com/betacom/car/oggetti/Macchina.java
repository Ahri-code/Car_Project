package com.betacom.car.oggetti;

public class Macchina extends Veicolo{

	private Integer numeroPorte;
	private String  numeroTarga;
	private Integer cc;

	public static  int  numeroMacchina;

	
	
	public static void statistiche() {
		System.out.printf("..... Macchine create %d , errori creazione macchina %d  \n", numeroMacchina, numeroErrori);
	}
	
	
	public Integer getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(Integer numeroPorte) {
		this.numeroPorte = numeroPorte;
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

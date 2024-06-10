package com.betacom.car.oggetti;

public class Bici extends Veicolo{
	private String tipoUso;
	private String tipoSuspenzione;
	private Boolean pieghevole;

	public static  int  numeroBici;

	public static void statistiche() {
		System.out.printf("..... Bici create %d , errori creazione macchina %d  \n", numeroBici, numeroErrori);
	}
	
	
	public String getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}
	public String getTipoSuspenzione() {
		return tipoSuspenzione;
	}
	public void setTipoSuspenzione(String tipoSuspenzione) {
		this.tipoSuspenzione = tipoSuspenzione;
	}
	public Boolean getPieghevole() {
		return pieghevole;
	}
	public void setPieghevole(Boolean pieghevole) {
		this.pieghevole = pieghevole;
	}
}

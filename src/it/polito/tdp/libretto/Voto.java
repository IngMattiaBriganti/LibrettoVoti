package it.polito.tdp.libretto;

import java.time.LocalDate;

public class Voto {
	private int votoOttenuto;
	private String nomeCorso;
	private LocalDate data; // java.util.date o java.util.calendar più BUG che bit
	
	
	public Voto(int votoOttenuto, String nomeCorso, LocalDate data) {
		super();
		this.votoOttenuto = votoOttenuto;
		this.nomeCorso = nomeCorso;
		this.data = data;
	}

	
	public int getVotoOttenuto() {
		return votoOttenuto;
	}
	public void setVotoOttenuto(int votoOttenuto) {
		this.votoOttenuto = votoOttenuto;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	

}

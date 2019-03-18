package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	private List<Voto> voti; //mantenere interfacce più generali possibile

	public Libretto() {
		
		voti = new ArrayList<Voto>();
		}
	
//	public void add(int voto, String corso, LocalDate data) {
//		sw lo faccio qua non è delegato, lo rifo una volta sola e via
//	}
	
	/**
	 * Aggiunge voto sul libretto
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto voto) {
		this.voti.add(voto); 			//MENO CONOSCO MEGLIO è
	
	}
	
}
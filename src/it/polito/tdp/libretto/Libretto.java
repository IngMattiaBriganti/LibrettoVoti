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
	
//	public void stampaVoti(int voto) {
//		
//	}
//	public String stampaVoti2(int voto) {
//		
//	}
	public List<Voto> cercaVoti(int voto){			//DEVO PASSARE IL PIù GENERALE POSSIBILE PER FARLO ELABORARE AL DI FUORI, SEPARO
		List<Voto> result=new ArrayList<Voto>();	//RICERCA E FORMATTAZIONE IN DUE CLASSI DIVERSE
		for(Voto temp:this.voti) {
			if(temp.getVotoOttenuto()==voto) {		//così facendo creo link all'oggetto
				result.add(temp);
			}
		}
			return result;
	}
	
	
	
	
	
}
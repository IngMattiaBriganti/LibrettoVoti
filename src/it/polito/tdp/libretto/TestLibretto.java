package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		//diverse classi di test ch tengo separate.
		
		Libretto libr =new Libretto();
		
		libr.add(new Voto(28, "Analisi I", 	LocalDate.of(2017, 02, 05)));
		libr.add(new Voto(27, "Analisi II", LocalDate.of(2018, 06, 25)));
		libr.add(new Voto(25, "Fisica I", 	LocalDate.of(2017, 02, 05)));
		libr.add(new Voto(27, "Fisica II", 	LocalDate.of(2018, 06, 05)));
		libr.add(new Voto(23, "Chimica", 	LocalDate.of(2017, 02, 15)));
		libr.add(new Voto(30, "PO", 		LocalDate.of(2017, 06, 05)));
		libr.add(new Voto(28, "Geometria", 	LocalDate.of(2018, 06, 15)));
		libr.add(new Voto(27, "PGP", 		LocalDate.of(2017, 02, 15)));
		libr.add(new Voto(30, "BASI", 		LocalDate.of(2017, 06, 15)));
		libr.add(new Voto(24, "Statistica", LocalDate.of(2017, 06, 05)));

		List<Voto> venticinque= libr.cercaVoti(25);
		System.out.println(venticinque);
		
		
	}

}

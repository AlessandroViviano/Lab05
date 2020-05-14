package it.polito.tdp.anagrammi.model;

import java.util.List;

public class TestRicerca {

	public static void main(String[] args) {
		
		Ricerca ric = new Ricerca();
		
		List<String> ana_ciao = ric.anagrammi("ciao");
		System.out.println(ana_ciao);
		
		List<String> ana_ramo = ric.anagrammi("ramo");
		System.out.println(ana_ramo);

	}

}

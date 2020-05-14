package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.DAO.ParolaDAO;

public class Ricerca {
	
	private List<String> soluzione;
	
	public List<String> anagrammi(String parola){
		
		this.soluzione = new ArrayList<>();
		
		parola = parola.toUpperCase();
		
		List<Character> disponibili = new ArrayList<>();
		
		for(int i=0; i<parola.length(); i++) {
			disponibili.add(parola.charAt(i));
		}
		
		cerca("", 0, disponibili);
		
		return this.soluzione;
	}
	
	private void cerca(String parziale, int livello, List<Character> disponibili) {
		
		if(disponibili.size()==0) {
			this.soluzione.add(parziale);
		}
		
		for(Character ch: disponibili) {
			String tentativo = parziale+ch;
			
			List<Character> rimanenti = new ArrayList<>(disponibili);
			
			rimanenti.remove(ch);
			
			cerca(tentativo, livello+1, rimanenti);
		}
	}
	
	public boolean isCorrect(String anagramma) {
		ParolaDAO dao = new ParolaDAO();
		return dao.isCorrect(anagramma);
	}
}

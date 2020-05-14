package it.polito.tdp.anagrammi.DAO;

public class TestDB {

	public static void main(String[] args) {
		
		ParolaDAO pdao = new ParolaDAO();
		
		String parola1 = "orma";
		String parola2 = "albero";
		String parola3 = "orab";
		
		pdao.isCorrect(parola1);
		pdao.isCorrect(parola2);
		pdao.isCorrect(parola3);

	}

}

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		String nome = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome");
		String cognome = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito");
		String colore = input.nextLine();
		
		System.out.println("Inserisci il giorno di nascita");
		int giorno  = input.nextInt();
		
		System.out.println("Inserisci il mese di nascita");
		int mese  = input.nextInt();
		
		System.out.println("Inserisci l'anno di nascita");
		int anno  = input.nextInt();
		
		System.out.println("La tua password è: " + nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno));
	}

}

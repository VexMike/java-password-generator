package org.lessons.java.security;

import java.time.LocalDateTime;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		// Utilizzo il metodo Scanner per chiedere all'utente di inserire un dato
		Scanner input = new Scanner(System.in);
		
		// Chiedo all'utente di inserire il suo nome
		System.out.println("Inserisci il tuo nome");
		// Stampo il nome
		String nome = input.nextLine();
		
		// Chiedo all'utente di inserire il suo cognome
		System.out.println("Inserisci il tuo cognome");
		// Stampo il suo cognome
		String cognome = input.nextLine();
		
		// Chiedo all'utente di inserire il suo colore preferito
		System.out.println("Inserisci il tuo colore preferito");
		// Stampo il colore
		String colore = input.nextLine();
		
		// Chiedo all'utente di inserire il giorno
		System.out.println("Inserisci il giorno di nascita");
		// Stampo il giorno
		int giorno  = input.nextInt();
		
		// Chiedo all'utente di inserire il mese
		System.out.println("Inserisci il mese di nascita");
		// Stampo il mese
		int mese  = input.nextInt();
		
		// Chiedo all'utente di inserire l'anno
		System.out.println("Inserisci l'anno di nascita");
		// Stampo l'anno
		int anno  = input.nextInt();
		
		// In alternativa si può utilizzare LocalDateTime per un inserimento della data come visto nella correzione
		// LocalDateTime dataRiferminento = LocalDateTime.of(anno, mese, giorno, 0, 0);
		
		// Stampo la data di LocalDateTime
		// System.out.println("Data con il metodo LocalDateTime: " + dataRiferminento);
		
		// Creo la variabile pawword concatenando le variabili stampate
		String passwordCalcolata = nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno);
		
		// Stampo la password
		System.out.println("La tua Password è: " + passwordCalcolata);
		
		// In alternativa stampare tutto su System.out.println
		// System.out.println("La tua password è: " + nome + "-" + cognome + "-" + colore + "-" + (giorno + mese + anno));
	}

}

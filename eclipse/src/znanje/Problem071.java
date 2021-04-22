package znanje;

import java.util.Scanner;

public class Problem071 {
	
	// 34. Sa tipkovnice upisati više znakova i ispisati na ekran.
	
	// Opis rješenja: Oznaka varijable za znakove u Javi je String.

	// Opis programa: Znakovi se upisuju sve dok se ne pritisne tipka 
	// ENTER jer je navedeno (String x). Deklarisanje varijable je razlièito za 
	// jedan i više znakova. Bitno je deklariranje varijable a ne ime varijable.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite više znakova: ");
		String x = input.next();
		
		System.out.println("String: " + x);
		
		input.close();
		
		
	}

}

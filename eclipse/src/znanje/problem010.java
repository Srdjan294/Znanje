package znanje;

import java.util.Scanner;

public class problem010 {
	
	// 5. Izracunati kvadrat upisanog broja i ispisati kao novu varijablu. Koristiti funkciju.

    // Opis programa: Kvadratna funkcija u programskom jeziku Java je Math.pow(x, 2)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi broj: ");
		
		double a = input.nextDouble();
		
		double x = Math.pow(a, 2);
		
		System.out.println("Kvadrat broja " + a + " je " + x);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem012 {
	
	// 5_2. Ucitati 3 broja. Naci razliku treceg i drugog te produkt prvog i drugog.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ucitaj 3 broja: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int razlika = c-b;
		int produkt = a*b;
		
		System.out.println("Razlika je: " + razlika + ", produkt je: " + produkt);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class problem029 {
	
	// 8_4. Ispisati udaljenost izme�u dvije upisane vrijednosti.

	// Opis programa: Udaljenost je pozitivna vrijednost zato se treba izra�unati 
	// apsolutna vrijednost razlike dvije vrijednosti. Za to se koristi ugra�ena 
	// matemati�ka funkcija izra�unavanja apsolutne vrijednosti Math.abs(b - a)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj: ");
		int a = input.nextInt();
		System.out.println("Unesi drugi broj: ");
		int b = input.nextInt();
		
		int c = Math.abs(a-b);
		
		System.out.println("Udaljenost izme�u "+a+" i "+b+" je "+c);
		
		input.close();
	}

}

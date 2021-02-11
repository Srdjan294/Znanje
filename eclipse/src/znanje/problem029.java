package znanje;

import java.util.Scanner;

public class problem029 {
	
	// 8_4. Ispisati udaljenost izmeðu dvije upisane vrijednosti.

	// Opis programa: Udaljenost je pozitivna vrijednost zato se treba izraèunati 
	// apsolutna vrijednost razlike dvije vrijednosti. Za to se koristi ugraðena 
	// matematièka funkcija izraèunavanja apsolutne vrijednosti Math.abs(b - a)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj: ");
		int a = input.nextInt();
		System.out.println("Unesi drugi broj: ");
		int b = input.nextInt();
		
		int c = Math.abs(a-b);
		
		System.out.println("Udaljenost izmeðu "+a+" i "+b+" je "+c);
		
		input.close();
	}

}

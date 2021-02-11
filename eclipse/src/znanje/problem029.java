package znanje;

import java.util.Scanner;

public class problem029 {
	
	// 8_4. Ispisati rastojanje izme�u dvije upisane vrijednosti.

	// Opis programa: Rastojenje je pozitivna vrijednost zato se treba izra�unati 
	// aplsolutna vrijednost razlike dvije vrijednosti. Za to se koristi ugra�ena 
	// matemati�ka funkcija izra�unavanja apsolutne vrijednosti Math.abs(b - a)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int c = Math.abs(a-b);
		
		System.out.println("Rastojenje izme�u "+a+" i "+b+" je "+c);
		
		input.close();
	}

}

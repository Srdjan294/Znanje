package znanje;

import java.util.Scanner;

public class problem006 {
	
	// Napisati program za ispis sume dva broja
	
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj a: ");
		int a = input.nextInt();
		System.out.println("Unesite broj b: ");
		int b = input.nextInt();
		
		int s = a+b;
		
		System.out.println("Suma je: " + s);
		
		input.close();
	}

}

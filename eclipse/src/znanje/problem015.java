package znanje;

import java.util.Scanner;

public class problem015 {
	
	// 6_2. Izracunati sumu kvadrata tri ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 3 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
		
		System.out.println("Suma kvadrata tri uèitana broja je: " + sum);
		
		input.close();
	}

}

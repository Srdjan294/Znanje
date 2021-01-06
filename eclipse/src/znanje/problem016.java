package znanje;

import java.util.Scanner;

public class problem016 {
	
	// 6_3. Izracunati sumu kubova dva ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = Math.pow(a, 3) + Math.pow(b, 3);
		
		System.out.println("Suma kubova dva uèitana broja: " + sum);
		
		input.close();
	}

}

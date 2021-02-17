package znanje;

import java.util.Scanner;

public class Problem017 {
	
	// 6_4. Izracunati sumu kubova tri ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 3 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double sum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
		
		System.out.println("Suma kubova 3 uèitana broja je: " + sum);
		
		input.close();
	}

}

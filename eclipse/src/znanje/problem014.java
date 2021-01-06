package znanje;

import java.util.Scanner;

public class problem014 {
	
	// 6_1. Izraèunati sumu kvadrata dva uèitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi prvi broj: ");
		double a = input.nextDouble();
		System.out.println("Unesi drugi broj: ");
		double b = input.nextDouble();
		
		double c = Math.pow(a, 2);
		double d = Math.pow(b, 2);
		
		double sum = c + d;
		
		System.out.println("Suma njihovih kvadrata je: " + sum);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem021 {
	
	// 6_8. Izracunati korijen sume kvadrata tri ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 3 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
		
		double korijen = Math.sqrt(sum);
		
		System.out.println("Korijen sume kvadrata 3 uèitana broja je: " + korijen);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem020 {
	
	// 6_7. Izraèunati korijen sume kvadrata dva uèitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		
		double korijen = Math.sqrt(sum);
		
		System.out.println("Korijen sume kvadrata 2 uèitana broja je: " + korijen);
		
		input.close();
	}

}

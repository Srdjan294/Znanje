package znanje;

import java.util.Scanner;

public class Problem020 {
	
	// 6_7. Izra�unati korijen sume kvadrata dva u�itana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("U�itaj 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		
		double korijen = Math.sqrt(sum);
		
		System.out.println("Korijen sume kvadrata 2 u�itana broja je: " + korijen);
		
		input.close();
	}

}

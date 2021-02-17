package znanje;

import java.util.Scanner;

public class Problem022 {
	
	// 6_9. Izracunati korijen apsolutne vrijednosti sume kvadrata dva ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		
		double abs = Math.abs(sum);
		
		double korijen = Math.sqrt(abs);
		
		System.out.println("Korijen apsolutne vrijednosti sume kvadrata dva uèitana broja je: " + korijen);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class problem023 {
	
	// 6_10. Izracunati korijen apsolutne vrijednosti sume kvadrata tri ucitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 3 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double sum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
		
		double abs = Math.abs(sum);
		
		double korijen = Math.sqrt(abs);
		
		System.out.println("Korijen apsolutne vrijednosti sume kvadrata tri uèitana broja je: " + korijen);
		
		input.close();
	}

}

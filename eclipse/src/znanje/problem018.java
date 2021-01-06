package znanje;

import java.util.Scanner;

public class problem018 {
	
	// 6_5. Uèitati 2 broja. Izraèunati korijen aritmetièke sredine njihovih apsoltnih vrijednosti.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double c = Math.abs(a);
		double d = Math.abs(b);
		
		double as = (c+d) / 2;
		
		double x = Math.sqrt(as);
		
		System.out.println("Korijen aritmetièke sredine apsolutnih vrijednosti 2 uèitana broja je: " + x);
		
		input.close();
	}

}

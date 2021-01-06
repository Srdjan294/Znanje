package znanje;

import java.util.Scanner;

public class problem019 {
	
	// 6_6. Uèitati 4 broja. Izraèunati korijen aritmetièke sredine njihovih apsoltnih vrijednosti.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Uèitaj 4 broja:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		double a2 = Math.abs(a);
		double b2 = Math.abs(b);
		double c2 = Math.abs(c);
		double d2 = Math.abs(d);
		
		double as = (a2+b2+c2+d2) / 4;
		
		double korijen = Math.sqrt(as);
		
		System.out.println("Korijen aritmetièke sredine apsolutnih vrijednosti 4 uèitana broja je: " + korijen);
		
		input.close();
	}

}

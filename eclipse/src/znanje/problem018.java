package znanje;

import java.util.Scanner;

public class problem018 {
	
	// 6_5. U�itati 2 broja. Izra�unati korijen aritmeti�ke sredine njihovih apsoltnih vrijednosti.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("U�itaj 2 broja: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		double c = Math.abs(a);
		double d = Math.abs(b);
		
		double as = (c+d) / 2;
		
		double x = Math.sqrt(as);
		
		System.out.println("Korijen aritmeti�ke sredine apsolutnih vrijednosti 2 u�itana broja je: " + x);
		
		input.close();
	}

}

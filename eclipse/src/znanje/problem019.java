package znanje;

import java.util.Scanner;

public class problem019 {
	
	// 6_6. U�itati 4 broja. Izra�unati korijen aritmeti�ke sredine njihovih apsoltnih vrijednosti.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("U�itaj 4 broja:");
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
		
		System.out.println("Korijen aritmeti�ke sredine apsolutnih vrijednosti 4 u�itana broja je: " + korijen);
		
		input.close();
	}

}

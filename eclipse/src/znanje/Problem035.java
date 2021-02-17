package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem035 {

	// 12_2. Poznata je povr�ina pravokutnika i stranica a. Izra�unati dijagonalu.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi povr�inu pravokutnika: ");
		double p = input.nextDouble();
		
		System.out.println("Unesi duljinu stranice pravokutnika: ");
		double a = input.nextDouble();
		
		double b = p/a;
		
		double d = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		
		System.out.println("Duljina dijagonale pravokutnika je: " + d);
		
		input.close();
	}
}

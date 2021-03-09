package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem049 {
	
	// 23. Izraèunati površinu i hipotenuzu pravokutnog trokuta, ako su poznate katete.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi duljinu prve katete pravokutnog trokuta: ");
		double a = input.nextDouble();
		System.out.println("Unesi duljinu druge katete pravokutnog trokuta: ");
		double b = input.nextDouble();
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		double p = (a*b)/2;
		
		System.out.println("Površina pravokutnog trokuta je: " + p + ", a hipotenuza je: " + c);
		
		input.close();
	}

}

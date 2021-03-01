package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem046 {
	
	// 21_1. Za poznate vrijednosti stranice i visine trokuta 
	// izraèunati odgovarajuæu površinu (P=a*h/2).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi duljinu stranice trokuta: ");
		double a = input.nextDouble();
		System.out.println("Unesi duljinu visine trokuta: ");
		double h = input.nextDouble();
		
		double p = (a*h)/2;
		
		System.out.println("Površina trokuta je: " + p);
		
		input.close();
	}

}

package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem048 {
	
	// 22_1. Za poznate vrijednosti površine i stranice trokuta 
	//       izraèunati odgovarajuæu visinu (P=a*h/2).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi površinu trokuta: ");
		double p = input.nextDouble();
		System.out.println("Unesi stranicu trokuta: ");
		double a = input.nextDouble();
		
		double h = p/a*2;
		
		System.out.println("Visina trokuta na zadanu stranicu je: " + h);
		
		input.close();
	}

}

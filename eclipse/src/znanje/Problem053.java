package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem053 {
	
	// 26_1. Za poznate vrijednosti volumena i baze valjka izra�unati odgovaraju�u visinu.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
				
		System.out.println("Unesi volumen valjka: ");
		double v = input.nextDouble();
		System.out.println("Unesi povr�inu baze valjka: ");
		double b = input.nextDouble();
		
		double h = v/b;
		
		System.out.println("Visina valjka je: " + h);
		
		input.close();
		
	}

}

package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem047 {
	
	// 22. Napisati program za izra�unavanje 
	// stranice trokuta ako je poznata povr�ina i visina trokuta (P=a*h/2)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi povr�inu trokuta: ");
		double p = input.nextDouble();
		System.out.println("Unesi visinu trokuta: ");
		double h = input.nextDouble();
		
		double a = p/(h/2);
		
		System.out.println("Duljina stranice a trokuta je: " + a);
		
		input.close();
	}

}

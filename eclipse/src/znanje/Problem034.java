package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem034 {
	
	// 12_1. Poznata je povr�ina pravokutnika i stranica a. Izra�unati opseg.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi povr�inu pravokutnika: ");
		double p = input.nextDouble();
		
		System.out.println("Unesi duljinu stranice a pravokutnika: ");
		double a = input.nextDouble();
		
		double b = p/a;
		
		double o = 2*(a+b);
		
		System.out.println("Opseg pravokutnika je: " + o);
		
		input.close();
	}
}

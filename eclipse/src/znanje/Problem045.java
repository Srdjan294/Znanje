package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem045 {
	
	// 21. U�itati stranice trokuta i na�i opseg i povr�inu.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednosti stranica trokuta: ");
		System.out.println("Stranica a: ");
		double a = input.nextDouble();
		System.out.println("Stranica b: ");
		double b = input.nextDouble();
		System.out.println("Stranica c: ");
		double c = input.nextDouble();
		
		double s = (a+b+c)/2;
		
		double p = Math.sqrt((s*(s-a)*(s-b)*(s-c))); //Heronova formula
		
		double o = a+b+c;
		
		System.out.println("Opseg trokuta je: " + o + ", povr�ina trokuta je: " + p);
		
		input.close();
	}

}

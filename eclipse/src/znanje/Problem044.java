package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem044 {
	
	// 20. Napisati program za izraèunavanje površine trokuta 
	//     koristeæi Heronovu formulu
	
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
		
		double p = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		
		System.out.println("Površina trokuta je: " + p);
		
		input.close();
	}

}

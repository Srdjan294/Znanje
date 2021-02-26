package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem043 {
	
	// 19. Napisati program za izraèunavanje opsega trokuta
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednosti stranica trokuta: ");
		System.out.println("Stranica a: ");
		double a = input.nextDouble();
		System.out.println("Stranica b: ");
		double b = input.nextDouble();
		System.out.println("Stranica c: ");
		double c = input.nextDouble();
		
		double o = a+b+c;
		
		System.out.println("Opseg trokuta je: " + o);
		
		input.close();
	}

}

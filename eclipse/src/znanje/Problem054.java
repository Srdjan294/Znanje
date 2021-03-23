package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem054 {
	
	// 27. Napisati program koji �e za u�itane vrijednosti x i y izra�unati
	// i ispisati vrijednosti a i b prema izrazima:
	// a=x+y
	// b=x-y
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("U�itaj vrijednost x: ");
		float x = input.nextFloat();
		System.out.println("U�itaj vrijednost y: ");
		float y = input.nextFloat();
		
		float a = x+y;
		float b = x-y;
		
		System.out.println("a=x+y : " + a);
		System.out.println("b=x-y : " + b);
		
		input.close();
	}
}

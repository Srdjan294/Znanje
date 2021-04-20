package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem067 {
	
	// 32_8. Napisati program koji za ispis rezultata izraza: a=(x^2+y^2)^2.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesite vrijednost y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal a = (x.pow(2).add(y.pow(2))).pow(2);
		
		System.out.println("a=(x^2+y^2)^2 : " + a);
		
		input.close();
	}

}

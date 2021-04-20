package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem068 {
	
	// 32_9. Napisati program koji za ispis rezultata izraza: a = c+e^2-d.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost c: ");
		BigDecimal c = input.nextBigDecimal();
		System.out.println("Unesite vrijednost e: ");
		BigDecimal e = input.nextBigDecimal();
		System.out.println("Unesite vrijednost d: ");
		BigDecimal d = input.nextBigDecimal();
		
		BigDecimal a = c.add(e.pow(2)).subtract(d);
		
		System.out.println("a = c+e^2-d : " + a);
		
		input.close();
	}

}

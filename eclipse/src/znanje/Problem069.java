package znanje;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem069 {
	
	// 32_10. Napisati program koji za ispis rezultata izraza: a = sqrt(8) - xy/3.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesite vrijednost y: ");
		BigDecimal y = input.nextBigDecimal();
		
		MathContext mc = new MathContext(5);
		
		BigDecimal a = (new BigDecimal(8).sqrt(mc)).subtract(x.multiply(y).divide(new BigDecimal(3),2,RoundingMode.HALF_UP));
		
		System.out.println("a = sqrt(8) - xy/3 : " + a);
		
		input.close();
	}
}

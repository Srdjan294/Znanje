package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem063 {

	// 32_4. Napisati program koji za ispis rezultata izraza: a=(x+y)/3-(y-8)/2 .
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesite vrijednost y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal a = (x.add(y).divide(new BigDecimal(3),2,RoundingMode.HALF_UP))
						.subtract((y.subtract(new BigDecimal(8)).divide(new BigDecimal(2))));
		
		System.out.println("Rezultat izraza a=(x+y)/3-(y-8)/2: " + a);
		
		input.close();
	}
}

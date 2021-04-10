package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem064 {
	
	// 32_5. Napisati program koji za ispis rezultata izraza: a = (x + y) / 2 - (y - 4) / 5 .
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesite vrijednost y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal a = ((x.add(y)).divide(new BigDecimal(2),2,RoundingMode.HALF_UP))
						.subtract((y.subtract(new BigDecimal(4))).divide(new BigDecimal(5)));
		
		System.out.println("a = (x + y) / 2 - (y - 4) / 5 : " + a);
		
		input.close();
	}

}

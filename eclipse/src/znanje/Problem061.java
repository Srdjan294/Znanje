package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem061 {
	
	// 32_2. Napisati program koji za ispis rezultata izraza: x = 6+(a+b)/2.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednos a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Unesite vrijednost b: ");
		BigDecimal b = input.nextBigDecimal();
		
		BigDecimal x = new BigDecimal(6).add((a.add(b)).divide(new BigDecimal(2),2,RoundingMode.HALF_UP));
		
		System.out.println("x = 6 + (a + b) / 2 : " + x);
		
		input.close();
	}

}

package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem062 {
	
	// 32_3. Napisati program koji za ispis rezultata izraza: x = (a-b)/4 - (b+a)/3.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Unesite vrijednost b: ");
		BigDecimal b = input.nextBigDecimal();
		
		BigDecimal x = ((a.subtract(b)).divide(new BigDecimal(4)))
				.subtract((b.add(a)).divide(new BigDecimal(3),2,RoundingMode.HALF_UP));
		
		System.out.println("x = (a-b)/4 - (b+a)/3 : " + x);
		
		input.close();
	}

}

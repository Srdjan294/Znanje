package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem065 {
	
	// 32_6. Napisati program koji za ispis rezultata izraza: x=abc/3 - de/2 .
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi vrijednost a:");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Unesi vrijednost b:");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("Unesi vrijednost c:");
		BigDecimal c = input.nextBigDecimal();
		System.out.println("Unesi vrijednost d:");
		BigDecimal d = input.nextBigDecimal();
		System.out.println("Unesi vrijednost e:");
		BigDecimal e = input.nextBigDecimal();
		
		BigDecimal x = ((a.multiply(b).multiply(c)).divide(new BigDecimal(3),2,RoundingMode.HALF_UP))
						.subtract((d.multiply(e)).divide(new BigDecimal(2)));
		
		System.out.println("x=abc/3 - de/2 : " + x);
		
		input.close();
	}

}

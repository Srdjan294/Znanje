package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem058 {
	
	// 31. Napisati program za uèitavanje tri broja. Prva dva zbrojiti i podjeliti sa treæim.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Uèitaj broj a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Uèitaj broj b: ");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("Uèitaj broj c: ");
		BigDecimal c = input.nextBigDecimal();
		
		BigDecimal rezultat = (a.add(b)).divide(c);
		
		System.out.println("(a + b) / c = " + rezultat);
		
		input.close();
	}

}

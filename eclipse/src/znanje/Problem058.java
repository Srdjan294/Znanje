package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem058 {
	
	// 31. Napisati program za u�itavanje tri broja. Prva dva zbrojiti i podjeliti sa tre�im.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("U�itaj broj a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("U�itaj broj b: ");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("U�itaj broj c: ");
		BigDecimal c = input.nextBigDecimal();
		
		BigDecimal rezultat = (a.add(b)).divide(c);
		
		System.out.println("(a + b) / c = " + rezultat);
		
		input.close();
	}

}

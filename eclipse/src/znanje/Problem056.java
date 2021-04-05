package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem056 {
	
	// 29. Izraèunati vrijednosti prema izrazima:
	//     a = x * y
	//	   b = x + y
	//     c = b / x
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi vrijednost x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesi vrijednost y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal a = x.multiply(y);
		BigDecimal b = x.add(y);
		BigDecimal c = b.divide(x);
		
		System.out.println("a = x * y : " + a + 
						   "\nb = x + y : " + b + 
						   "\nc = b / x : " + c);
		
		input.close();
	}

}

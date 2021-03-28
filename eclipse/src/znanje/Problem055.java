package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem055 {
	
	// 28. Napisati program koji izraèunava slijedeæe izraze:
	//     c = x * y
	//	   d = x - y
	//     e = c - x + y
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi varijablu x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesi varijablu y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal c = x.multiply(y);
		BigDecimal d = x.subtract(y);
		BigDecimal e = (c.subtract(x)).add(y);
		
		System.out.println("c=x*y: " + c
				+ "\nd=x-y: " + d
				+ "\ne=c-x+y: " + e);
		
		input.close();
	}

}

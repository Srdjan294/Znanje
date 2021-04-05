package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem057 {
	
	// 30. Napisati program za izraèunavanje sume, produkta i razlike dva uèitana broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi broj x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesi broj y: ");
		BigDecimal y = input.nextBigDecimal();
		
		System.out.println("x + y : " + x.add(y) + 
				"\nx * y : " + x.multiply(y) + 
				"\nx - y : " + x.subtract(y) + 
				"\ny - x : " + y.subtract(x));
		 
		input.close();
	}

}

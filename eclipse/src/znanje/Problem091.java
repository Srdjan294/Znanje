package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem091 {
	
	// 49_1. Napisati program koji za u�itano x ispisuje vrijednost y po formuli:
	//       y = kx + b
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite varijable za jednad�bu y = kx + b: ");
		System.out.println("k: ");
		BigDecimal k = input.nextBigDecimal();
		System.out.println("x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("b: ");
		BigDecimal b = input.nextBigDecimal();
		
		BigDecimal y = (k.multiply(x)).add(b);
		
		System.out.println("Rje�enje y = kx + b : " + y);
		
		input.close();
	}

}

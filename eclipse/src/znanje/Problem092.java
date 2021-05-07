package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem092 {
	
	// 49_2. Napisati program koji za uèitano x ispisuje vrijednost y po formuli:
    //       y = ax^2 + bx + c
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite varijable za jednadžbu: ");
		System.out.println("a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("b: ");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("c: ");
		BigDecimal c = input.nextBigDecimal();
		
		BigDecimal y = (a.multiply(x.pow(2))).add(b.multiply(x)).add(c);
		
		System.out.println("Rješenje y = ax^2 + bx + c : " + y);
		
		input.close();
	}

}

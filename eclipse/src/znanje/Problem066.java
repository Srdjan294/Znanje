package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem066 {
	
	// 32_7. Napisati program koji za ispis rezultata izraza: x=b^2-4ac
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost a: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Unesite vrijednost b: ");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("Unesite vrijednost c: ");
		BigDecimal c = input.nextBigDecimal();
		
		BigDecimal x = b.pow(2).subtract((new BigDecimal(4)).multiply(a).multiply(c));
		
		System.out.println("x=b^2-4ac : " + x);
		
		input.close();
	}

}

package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem059 {
	
	// 32. Napisati program za ispis prosjeka 5 brojeva.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi 5 brojeva: ");
		System.out.println("1. broj: ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("2. broj: ");
		BigDecimal b = input.nextBigDecimal();
		System.out.println("3. broj: ");
		BigDecimal c = input.nextBigDecimal();
		System.out.println("4. broj: ");
		BigDecimal d = input.nextBigDecimal();
		System.out.println("5. broj: ");
		BigDecimal e = input.nextBigDecimal();
		
		BigDecimal prosjek = (a.add(b).add(c).add(d).add(e)).divide(new BigDecimal(5));
		
		System.out.println("Prosjek uèitanih brojeva je: " + prosjek);
		
		input.close();
	}

}

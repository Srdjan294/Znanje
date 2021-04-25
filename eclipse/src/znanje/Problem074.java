package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem074 {
	
	// 37. Napisati program za pretvaranje dolara u eure (1$ = 0.83e).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
				
		System.out.println("Unesite iznos dolara: ");
		BigDecimal dolar = input.nextBigDecimal().setScale(2,RoundingMode.HALF_UP);
			
	    BigDecimal euro;
	    euro = dolar.multiply(new BigDecimal (0.83)).setScale(2,RoundingMode.HALF_UP);
				
		System.out.println("Iznos " + dolar + "$ u eurima je: " + euro + "e.");
		
		input.close();
	}

}

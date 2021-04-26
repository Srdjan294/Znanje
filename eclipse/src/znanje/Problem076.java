package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem076 {
	
	// 39. Napisati program za pretvaranje kelvinovih stupnjeva u celzijusove stupnjeve.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite kelvinove stupnjeve: ");
		BigDecimal kelvin = input.nextBigDecimal();
		
		BigDecimal celzijus = kelvin.subtract(new BigDecimal(273.15)).setScale(2,RoundingMode.HALF_UP);
		
		System.out.println(kelvin + " °K : " + celzijus + " °C.");
		
		input.close();
	}

}

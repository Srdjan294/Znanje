package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem078 {

	// 40_1. Napisati program za pretvaranje du�ine puta u miljama
	//       u du�inu u kilometrima (1 milja = 1,825 km).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite du�inu puta u miljama: ");
		BigDecimal milje = input.nextBigDecimal();
		
		BigDecimal kilometri = milje.multiply(new BigDecimal(1.825)).setScale(5,RoundingMode.HALF_UP);
		
		System.out.println(milje + " milja je " + kilometri + " km.");
		
		input.close();
	}
}

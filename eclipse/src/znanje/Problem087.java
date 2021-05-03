package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem087 {
	
	// 46. Napisati program za izraèunavanje godišnje kamate.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite iznos glavnice: ");
		BigDecimal c = input.nextBigDecimal();
		System.out.println("Unesite broj godina: ");
		BigDecimal n = input.nextBigDecimal();
		System.out.println("Unesite iznos koji treba platiti: ");
		BigDecimal k = input.nextBigDecimal();

		BigDecimal p = (new BigDecimal(100).multiply(k.subtract(c))).divide(n.multiply(c),2,RoundingMode.HALF_UP);
		
		System.out.println("Godišnja kamata iznosi: " + p + "%.");
		
		input.close();
	}

}

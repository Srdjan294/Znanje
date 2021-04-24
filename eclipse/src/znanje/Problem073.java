package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem073 {
	
	// 36. Napisati program za pretvaranje galona u litre. (1 galon = 4.54 litre).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite obujam u galonima: ");
		BigDecimal galon = input.nextBigDecimal();
		
		BigDecimal litra = galon.multiply(new BigDecimal(4.54609).setScale(5,RoundingMode.HALF_UP));
		
		System.out.println("Obujam u litrama je: " + litra);
		
		input.close();
	}

}

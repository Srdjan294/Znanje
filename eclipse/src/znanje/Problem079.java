package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem079 {
	
	// 40_2. Napisati program za pretvaranje dužine puta u 
	//       kilometrima u dužinu u miljama (1km iznosi 0.6214 milje).

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite duljinu u kilometrima: ");
		BigDecimal kilometri = input.nextBigDecimal();
		
		BigDecimal milje = kilometri.multiply(new BigDecimal(0.6214)).setScale(5, RoundingMode.HALF_UP);
		
		System.out.println(kilometri + " km je " + milje + " milja.");
		
		input.close();
		
	}
}

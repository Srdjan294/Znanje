package znanje;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class Problem097 {
	
	// 52. Uèitati koordinate toèke M1(x1,y1) i izraèunati udaljenost od koordinatnog poèetka.
	//     Udaljenost izmeðu dvije toèke (x1,y1) i (x2,y2) je sqrt((x2-x1)^2+(y2-y1)^2).
	//     Ako je prva toèka ishodište (0,0) onda je sqrt((x2-0)^2+(y2-0)^2) -> sqrt(x2^2 + y2^2).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite koordinate toèke M1(x1,y1): ");
		System.out.println("x1: ");
		BigDecimal x1 = input.nextBigDecimal();
		System.out.println("y1: ");
		BigDecimal y1 = input.nextBigDecimal();
		
		MathContext mc = new MathContext(10);
		
		BigDecimal d = ((x1.pow(2)).add(y1.pow(2))).sqrt(mc);
		
		System.out.println("Udaljenost od ishodišta(0,0) do toèke M1(" + x1 + "," + y1 + ") je: " + d);
		
		input.close();
	}

}

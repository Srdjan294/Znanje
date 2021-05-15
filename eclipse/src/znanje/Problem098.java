package znanje;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class Problem098 {
	
	// 53. Uèitati koordinate dvije toèke M1(x1,y1) i M2(x2,y2) i 
	//     izraèunati pojedinaènu udaljenost toèaka od koordinatnog poèetka.
    //     Udaljenost izmeðu dvije toèke (x1,y1) i (x2,y2) je sqrt((x2-x1)^2+(y2-y1)^2).
	//     Ako je prva toèka ishodište (0,0) onda je sqrt((x2-0)^2+(y2-0)^2) -> sqrt(x2^2 + y2^2).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite koordinate toèke M1(x1,y1): ");
		System.out.println("x1: ");
		BigDecimal x1 = input.nextBigDecimal();
		System.out.println("y1: ");
		BigDecimal y1 = input.nextBigDecimal();
		
		System.out.println("Unesite koordinate toèke M2(x2,y2): ");
		System.out.println("x2: ");
		BigDecimal x2 = input.nextBigDecimal();
		System.out.println("y2: ");
		BigDecimal y2 = input.nextBigDecimal();
		
		MathContext mc = new MathContext(10);
		
		BigDecimal d1 = ((x1.pow(2)).add(y1.pow(2))).sqrt(mc);
		BigDecimal d2 = ((x2.pow(2)).add(y2.pow(2))).sqrt(mc);
		
		System.out.println("Udaljenost od ishodišta(0,0) do toèke M1(" + x1 + "," + y1 + ") je: " + d1);
		System.out.println("Udaljenost od ishodišta(0,0) do toèke M2(" + x2 + "," + y2 + ") je: " + d2);
		
		input.close();
	}

}

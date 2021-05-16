package znanje;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Scanner;

public class Problem099 {
	
	// 54. U�itati koordinate dvije to�ke M1(x1,y1) i M2(x2,y2) i izra�unati udaljenost to�aka.
	//     Udaljenost izme�u dvije to�ke (x1,y1) i (x2,y2) je sqrt((x2-x1)^2+(y2-y1)^2).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite koordinate to�ke M1(x1,y1): ");
		System.out.println("x1: ");
		BigDecimal x1 = input.nextBigDecimal();
		System.out.println("y1: ");
		BigDecimal y1 = input.nextBigDecimal();
		
		System.out.println("Unesite koordinate to�ke M2(x2,y2): ");
		System.out.println("x2: ");
		BigDecimal x2 = input.nextBigDecimal();
		System.out.println("y2: ");
		BigDecimal y2 = input.nextBigDecimal();
		
		MathContext mc = new MathContext(10);
		
		BigDecimal d = (((x2.subtract(x1)).pow(2)).add((y2.subtract(y1)).pow(2))).sqrt(mc);
		
		System.out.println("Udaljenost izme�u to�aka M1(" + x1 + "," + y1 + ") i "
				+ "M2(" + x2 + "," + y2 + ") je: " + d);
		
		input.close();
	}

}

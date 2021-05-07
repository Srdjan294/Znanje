package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem094 {
	
	// 49_4. Napisati program koji za uèitano x ispisuje vrijednost y po formuli:
	//       y = log x
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite x: ");
		BigDecimal x = input.nextBigDecimal();
		
		double xd = x.doubleValue();
		
		double y = Math.log(xd);
		
		System.out.println("Rješenje y = log(x) : " + y);
 		
		input.close();
	}

}

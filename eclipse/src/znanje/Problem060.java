package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem060 {
	
	// 32_1. Napisati program koji za ispis rezultata izraza: (x-y)/3.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite x: ");
		BigDecimal x = input.nextBigDecimal();
		System.out.println("Unesite y: ");
		BigDecimal y = input.nextBigDecimal();
		
		BigDecimal izraz = (x.subtract(y)).divide(new BigDecimal(3),2,RoundingMode.HALF_UP);
		
		System.out.println("Rješenje izraza (x-y)/3 = " + izraz);
		
		input.close();
	}

}

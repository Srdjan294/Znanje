package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem075 {
	
	// 38. Napisati program za pretvaranje km/h u m/s.
	//     Primjer: 100 km/h, 1000m/3600s, 100 * m/3.6s, 100/3.6 = 27.7 m/s 
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite brzinu (km/h): ");
		BigDecimal brzina = input.nextBigDecimal();
		
		BigDecimal preracunato = brzina.divide(new BigDecimal(3.6),2,RoundingMode.HALF_UP);
		
		System.out.println("Brzina: " + brzina + "km/h preraèunato u m/s je: " + preracunato + "m/s.");
		
		input.close();
	}

}

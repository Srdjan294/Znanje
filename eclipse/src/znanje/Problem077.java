package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem077 {
	
	// 40. Napisati program kojim se prevodi temperatura iz celzijusa u fahrenheite.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite temperaturu u celzijusima: ");
		BigDecimal celzijus = input.nextBigDecimal();
		
		//(°C*9/5)+32
		BigDecimal fahrenheit = (celzijus.multiply(new BigDecimal(9).divide(new BigDecimal(5),2,RoundingMode.HALF_UP)))
								.add(new BigDecimal(32)).setScale(2,RoundingMode.HALF_UP);
		
		System.out.println(celzijus + " °C : " + fahrenheit + " °F.");
		
		input.close();
	}

}

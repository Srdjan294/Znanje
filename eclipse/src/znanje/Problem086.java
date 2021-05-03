package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem086 {
	
	// 45. U banci imate odreðenu sumu novca. Godišnja kamata je 17%. 
	//     Pod predpostavkom da ništa ne podižete u banci,
	//     koliko æete novaca imati nakon tri godine.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Koliko iznosi vaša glavnica: ");
		BigDecimal glavnica = input.nextBigDecimal();
		
		BigDecimal prvaGodina = glavnica.add(glavnica.multiply(new BigDecimal(0.17)))
								.setScale(2,RoundingMode.HALF_UP);
		BigDecimal drugaGodina = prvaGodina.add(prvaGodina.multiply(new BigDecimal(0.17)))
								.setScale(2,RoundingMode.HALF_UP);
		BigDecimal trecaGodina = drugaGodina.add(drugaGodina.multiply(new BigDecimal(0.17)))
								.setScale(2,RoundingMode.HALF_UP);
		
		System.out.println("Nakon tri godine u banci imate iznos od: " + trecaGodina);
		
		input.close();
	}

}

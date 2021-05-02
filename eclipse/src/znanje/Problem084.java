package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem084 {
	
	// 43. Ako vozilo prijeðe sa x litara s km. Koliko potroši litara na 100 km.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite koliko litara potroši vozilo: ");
		BigDecimal x = input.nextBigDecimal(); // x - litara
		System.out.println("Unesite koliko je kilometara prešlo vozilo: ");
		BigDecimal s = input.nextBigDecimal(); // s - kilometara
		
		// x/s - potrošeno litara na kilometražu
		// npr. 5l/50km -> 1l/10km
		
		//potrošeno litara na 100 km
		BigDecimal km100 = x.divide(s,2,RoundingMode.HALF_UP).multiply(new BigDecimal(100));
		
		System.out.println("Vozilo potroši " + km100 + " litara za 100 km.");
		
		input.close();
	}

}

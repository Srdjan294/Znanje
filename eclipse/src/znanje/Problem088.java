package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem088 {
	
	// 47. Napisati  program za izraèunavanje prijeðenog puta (s)  
	//     pri jednolikom ubrzanom kretanju ( s=v0t + at^2/2 ).
	
	public static void main(String[] args) {
		
		// Biciklist vozi poèetnom brzinom v0.
		// U jednom trenutku poène ubrzavati akceleracijom a,
		// te nakon vremena t postigne brzinu v.
		// Izraz koji povezuje te velièine je:
		// v = v0 + a*t -> v-v0 = a*t
		// Prijeðeni put pri jednolikom gibanju dobijemo:
		// s1 = v0*t
		// ako ubrzamo dobijemo:
		// s2 = ((v-v0)*t)/2
		// Cijeli put bi onda bio s = s1 + s2.
		// s = v0*t + ((v-v0)*t)/2
		// s = v0*t + (a*t*t)/2
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite poèetnu brzinu (m/s): ");
		BigDecimal v0 = input.nextBigDecimal();
		System.out.println("Unesite ubrzanje (m/s^2): ");
		BigDecimal a = input.nextBigDecimal();
		System.out.println("Unesite vrijeme kretanja (s): ");
		BigDecimal t = input.nextBigDecimal();
		
		BigDecimal s = (v0.multiply(t)).add((a.multiply(t.pow(2))).divide(new BigDecimal(2),2,RoundingMode.HALF_UP));
		
		System.out.println("Prijeðeni put pri jednolikom ubrzanom gibanju je: " + s + " m.");
		
		input.close();
	}

}

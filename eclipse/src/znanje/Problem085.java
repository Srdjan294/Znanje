package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem085 {
	
	// 44. Koliko treba dodati primjese u tekuæinu volumena V da se sa 2% poveæa na 5%.
	
	public static void main(String[] args) {
		
		// npr. volumen je 100l, alkohola ima 2% znaèi 2l, 0.02, 2%100
		// koliko treba dodati alkohola da bude 5%
		// dodamo 1l alkohola : v=101l alk=3l 3/101 0.029 2.9%
		//                      v=102l alk=4l 4/102 0.039 3.9%
		//                      v=103l alk=5l 5/104 0.048 4.8%
		//
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		BigDecimal pocetno = new BigDecimal(0.02);
		BigDecimal zavrsno = new BigDecimal(0.05);
		
		System.out.println("Unesite volumen tekuæine gdje je udjel 2%: ");
		BigDecimal v = input.nextBigDecimal();
		
		BigDecimal primjesa = ((zavrsno.subtract(pocetno)).divide(BigDecimal.ONE.subtract(zavrsno),5,RoundingMode.HALF_UP)).multiply(v);
		
		System.out.println("Da bi udio postao 5% potrebno je dodati " + primjesa + "L primjese.");
		
		input.close();
	}

}

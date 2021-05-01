package znanje;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Problem083 {
	
	// 42. Jedan radnik uradi posao za M dana a drugi za N dana.
	//     Za koliko dana bi uradili posao ako rade zajedno.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Koliko dana treba prvom radniku da završi posao: ");
		int m = input.nextInt();
		
		System.out.println("Koliko dana treba drugom radniku da završi posao: ");
		int n = input.nextInt();
		
		BigDecimal posao = (BigDecimal.valueOf(m).add(BigDecimal.valueOf(n)))
							.divide(new BigDecimal(2));
		
		System.out.println("Ako rade zajedno, dva radnika bi trebala završiti posao za " + 
							posao + " dana.");
		
		input.close();
	}

}

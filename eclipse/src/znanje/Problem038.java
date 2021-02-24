package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem038 {

	// 15. Za upisani polumjer izra�unati povr�inu kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite polumjer kruga: ");
		double r = input.nextDouble();
		
		double p = Math.pow(r, 2)*Math.PI;
		
		System.out.println("Povr�ina kruga je: " + p);
		
		input.close();
	}
}

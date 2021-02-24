package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem038 {

	// 15. Za upisani polumjer izraèunati površinu kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite polumjer kruga: ");
		double r = input.nextDouble();
		
		double p = Math.pow(r, 2)*Math.PI;
		
		System.out.println("Površina kruga je: " + p);
		
		input.close();
	}
}

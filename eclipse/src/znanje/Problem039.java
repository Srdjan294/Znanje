package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem039 {
	
	// Za upisani polumjer izraèunati obim i površinu kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Upiši polumjer kruga");
		double r = input.nextDouble();
		
		double o = 2*r*Math.PI;
		double p = Math.pow(r, 2)*Math.PI;
		
		System.out.println("Opseg kruga: " + o + ", površina kruga: " + p);
		
		input.close();
	}

}

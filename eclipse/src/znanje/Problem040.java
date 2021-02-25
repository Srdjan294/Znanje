package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem040 {
	
	//17. Za poznatu površinu kruga izraèunati polumjer i opseg kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi površinu kruga: ");
		double p = input.nextDouble();
		
		double r = Math.sqrt(p/Math.PI);
		double o = 2 * r * Math.PI;
		
		System.out.println("Polumjer kruga je: "+r+", a opseg kruga je: "+o);
		
		input.close();
	}

}

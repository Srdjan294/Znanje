package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem040 {
	
	//17. Za poznatu povr�inu kruga izra�unati polumjer i opseg kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi povr�inu kruga: ");
		double p = input.nextDouble();
		
		double r = Math.sqrt(p/Math.PI);
		double o = 2 * r * Math.PI;
		
		System.out.println("Polumjer kruga je: "+r+", a opseg kruga je: "+o);
		
		input.close();
	}

}

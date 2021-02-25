package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem041 {
	
	// 18. Za poznat opseg kruga izra�unati polumjer i povr�inu kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi opseg kruga: ");
		double o = input.nextDouble();
		
		double r = o/(Math.PI*2);
		double p = Math.pow(r, 2)*Math.PI;
		
		System.out.println("Polumjer kruga je: "+r+", povr�ina kruga je: "+p);
		
		input.close();
	}

}

package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem037 {
	
	// 14. Za upisani polumjer izra�unati opseg kruga.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Upi�i polumjer kruga: ");
		double r = input.nextDouble();
		
		double o = 2*r*Math.PI;
		
		System.out.println("Opseg kruga je: "+o);
		
		input.close();
	}

}

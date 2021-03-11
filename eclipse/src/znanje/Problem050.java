package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem050 {
	
	// 24. Izraèunati dijalgonale d i D kocke (za poznatu stranicu a).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi stranicu kocke: ");
		double a = input.nextDouble();
		
		double d = Math.sqrt(2*(Math.pow(a, 2)));
		
		double D = Math.sqrt(Math.pow(d, 2) + Math.pow(a, 2));
		
		System.out.println("Duljina dijagonale strane je: " + d + ", a duljina prostorne "
				+ "dijagonale je: " + D);
		
		input.close();
	}

}

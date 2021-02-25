package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem042 {
	
	// 18_1. Za poznati polumjer izraèunati površinu i volumen kugle.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi polumjer kugle: ");
		double r = input.nextDouble();
		
		double p = 4*Math.PI*Math.pow(r, 2);
		double v = (4*Math.PI*Math.pow(r, 3))/3;
		
		System.out.println("Površina kugle je: "+p+", volumen kugle je: "+v);
		
		input.close();
	
	}

}

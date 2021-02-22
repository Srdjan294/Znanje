package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem036 {

	// 13. Napisati program za izraèunavanje izraza: 2x, a / 3.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi x: ");
		double x = input.nextDouble();
		System.out.println("Unesi a: ");
		double a = input.nextDouble();
		
		System.out.println("Rezultati: 2x: "+2*x+" i a/3: "+a/3);
		
		input.close();
	}
}

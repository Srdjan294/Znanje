package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem051 {
	
	// Izraèunati O(opseg), P(površina) i V(volumen) kvadra (za poznate stranice a, b, c).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi duljinu stranice a: ");
		double a = input.nextDouble();
		System.out.println("Unesi duljinu stranice b: ");
		double b = input.nextDouble();
		System.out.println("Unesi duljinu stranice c: ");
		double c = input.nextDouble();
		
		double o = 4*(a+b+c);
		
		double p = 2*(a*b+a*c+b*c);
		
		double v = a*b*c;
		
		System.out.println("Opseg stranica kvadra je: " + o + ", površina je: " + p + 
				", a volumen je: " + v);
		
		input.close();
	}

}

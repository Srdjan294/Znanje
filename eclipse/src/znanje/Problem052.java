package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem052 {
	
	// 26. Izraèunati dijagonale d i D kvadra (za poznate stranice a, b, c).
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesi duljine stranica kvadra: ");
		System.out.println("a: ");
		double a = input.nextDouble();
		System.out.println("b: ");
		double b = input.nextDouble();
		System.out.println("c: ");
		double c = input.nextDouble();
		
		double D = Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
		double d1 = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		double d2 = Math.sqrt(Math.pow(a, 2)+Math.pow(c, 2));
		double d3 = Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2));
		
		System.out.println("Prostorna dijagonala kvadra je: " + D);
		System.out.println("Dijagonala koju obrezuju stranice a i b: " + d1);
		System.out.println("Dijagonala koju obrezuju stranice a i c: " + d2);
		System.out.println("Dijagonala koju obrezuju stranice b i c: " + d3);
		
		input.close();
	}

}

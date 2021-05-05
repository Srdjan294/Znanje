package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem090 {
	
	// 49. Napisati program koji za uèitano x ispisuje vrijednost y po formuli:
	//     a) y = kx + b
    //     b) y = ax^2 + bx + c
	//     c) y = tg x
    //     d) y = log x.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite brojeve: ");
		System.out.println("a: ");
		double a = input.nextDouble();
		System.out.println("b: ");
		double b = input.nextDouble();
		System.out.println("c: ");
		double c = input.nextDouble();
		System.out.println("k: ");
		double k = input.nextDouble();
		System.out.println("x: ");
		double x = input.nextDouble();
		
		double ay = k*x+b;
		double by = a*(Math.pow(x, 2))+b*x+c;
		double cy = Math.tan(x);
		double dy = Math.log(x);
		
		System.out.println("a) y = kx + b : " + ay);
		System.out.println("b) y = ax^2 + bx + c : " + by);
		System.out.println("c) y = tg x : " + cy);
		System.out.println("d) y = log x : " + dy);
		
		input.close();
	}

}

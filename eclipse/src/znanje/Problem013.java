package znanje;

import java.util.Scanner;

public class Problem013 {
	
	// 6. Izraèunati kvadratni korijen upisanog broja i ispisati kao novu varijablu. 
	//    Koristiti funkciju SQRT. (Obavezno uèitati nenegatvni broj)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kvadratni korijen");
		int a = input.nextInt();
		
		double x = Math.sqrt(a);
		
		System.out.println("Broj: " + a + ", korijen je: " + x);
		
		input.close();
	}

}

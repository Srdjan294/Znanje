package znanje;

import java.util.Scanner;

public class problem007 {
	
	// 3. Izraèunati kvadrat upisanog broja.
	
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Unesi broj: ");
//		int a = input.nextInt();
//		
//		int x = a*a;
//		
//		System.out.println("Kvadrat broja " + a + " je " + x);
//		
//		input.close();
		
		// 2. varijanta
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Unesi broj: ");
//		float a = input.nextFloat();
//		
//		float x = a*a;
//		
//		System.out.println("Kvadrat broja "+ a + " je " + x);
//		
//		input.close();
		
		//3 varijanta
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi broj: ");
		double a = input.nextDouble();
		
		double b = 2;
		
		System.out.println("Kvadrat broja " + a + " je " + Math.pow(a, b));
		
		input.close();
	}

}

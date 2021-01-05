package znanje;

import java.util.Scanner;

public class problem009 {
	
	// 4. Napisati program za izracunavanje aritmeticke sredine tri broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi 3 broja: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double as = (a+b+c)/3;
		
		System.out.println("Aritmetièka sredina 3 broja je: " + as);
		
		input.close();
	}

}

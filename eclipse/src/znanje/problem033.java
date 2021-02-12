package znanje;

import java.util.Scanner;

public class problem033 {
	
	// Napisati program za izraèunavanje dijagonale pravokutnika.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice a pravokutnika: ");
		int a = input.nextInt();
		System.out.println("Unesi duljinu stranice b pravokutnika: ");
		int b = input.nextInt();
		
		double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );
		
		System.out.println("Dijagonala pravokutnika je: " + d);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem002 {
	
	// 1_1. Napisati program za upis i ispis dva broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Prvi broj: ");
		int a = input.nextInt();            //ucitaj prvi broj
		
		System.out.println("Drugi broj: ");
		int b = input.nextInt();            //ucitaj drugi broj
		
		System.out.println("Prvi broj: " + a + ", Drugi broj: " + b);
				
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem003 {
	
	// 1_2. Napisati program za upis dva broja i ispisti ih u obrnutom redoslijedu ucitavanja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite dva broja: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Drugi broj: " + b);
		System.out.println("Prvi broj: " + a);
		
		input.close();
	}

}

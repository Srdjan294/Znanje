package znanje;

import java.util.Scanner;

public class Problem005 {
	
	// 1_4. Napisati program za upis i ispis tri broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite 3 broja");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("Brojevi u obrnutom redosljedu su: " + c + ", " + b + " i " + a);
		
		input.close();
	}

}

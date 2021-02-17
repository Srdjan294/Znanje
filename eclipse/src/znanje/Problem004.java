package znanje;

import java.util.Scanner;

public class Problem004 {
	
	// 1_3. Napisati program za upis i ispis tri broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite 3 broja: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		System.out.println("Uneseni brojevi su: " + a + ", "+ b +" i " + c );
		
		input.close();
	}

}

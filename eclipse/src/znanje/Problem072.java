package znanje;

import java.util.Scanner;

public class Problem072 {
	
	// 35. Napisati program za ispis unesenog znaka i njegovog ASCII broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite znak: ");
		char x = input.next().charAt(0);
		
		int ascii = (int) x; 
		
		System.out.println("ASCII vrijednost znaka " + x + " je: " + ascii);
		
		input.close();
	}

}

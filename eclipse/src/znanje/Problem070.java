package znanje;

import java.util.Scanner;

public class Problem070 {
	
	// 33. Na ekranu ispisati tekst Znak. Zatima sa tastature upisati znak i ispisati ga na ekranu.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Znak ");
		
		char x = input.next().charAt(0);
		
		System.out.println("Znak: " + x);
		
		input.close();
	}

}

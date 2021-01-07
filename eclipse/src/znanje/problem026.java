package znanje;

import java.util.Scanner;

public class problem026 {
	
	// 8_1. Izracunati opseg kocke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi vrijednost stranice kocke: ");
		int a = input.nextInt();
		
		double o = 12*a;
		
		System.out.println("Opseg kocke je: " + o);
		
		input.close();
	}

}

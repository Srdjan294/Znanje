package znanje;

import java.util.Scanner;

public class Problem025 {
	
	// 8. Izracunati opseg kvadrata.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice kvadrata: ");
		double a = input.nextDouble();
		
		double o = 4*a;
		
		System.out.println("Opseg kvadrata je: " + o);
		
		input.close();
	}

}

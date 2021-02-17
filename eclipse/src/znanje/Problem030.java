package znanje;

import java.util.Scanner;

public class Problem030 {
	
	// 9. Izraèunati dijagonalu kvadrata.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice kvadrata: ");
		double a = input.nextInt();
		
		double d = a * Math.sqrt(2);
		
		System.out.println("Duljina dijagonale kvadrata je: "+d);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class problem024 {
	
	// 7. 	Izraèunati površinu kvadrata.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice kvadrata: ");
		double a = input.nextDouble();
		
		double p = a*a;
		
		System.out.println("Površina kvadrata je: " + p);
		
		input.close();
	}

}

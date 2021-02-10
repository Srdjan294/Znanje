package znanje;

import java.util.Scanner;

public class problem027 {
	
	// 8_2. Za upisanu stranicu izraèunati površinu kocke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu brida kocke: ");
		int a = input.nextInt();
		System.out.println("Površina kocke je: " + 6*a*a);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class problem027 {
	
	// 8_2. Za upisanu stranicu izra�unati povr�inu kocke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu brida kocke: ");
		int a = input.nextInt();
		System.out.println("Povr�ina kocke je: " + 6*a*a);
		
		input.close();
	}

}

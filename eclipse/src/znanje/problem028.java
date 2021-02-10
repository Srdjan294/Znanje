package znanje;

import java.util.Scanner;

public class problem028 {
	
	// 8_3. Izraèunati volumen kocke
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu brida kocke: ");
		int a = input.nextInt();
		System.out.println("Volumen kocke je: " + a*a*a);
		
		input.close();
	}

}

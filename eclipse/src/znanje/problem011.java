package znanje;

import java.util.Scanner;

public class problem011 {
	
	// 5_1. Ucitati 3 broja. Naci sumu prvog i treceg te razliku treceg i prvog.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int suma, razlika;
		
		System.out.println("Unesi 3 broja: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		suma = a+c;
		razlika = c-a;
		
		System.out.println("Suma prvog i treæeg je: " + suma + ", a razlika treæeg i prvog je: " + razlika);
		
		input.close();
	}

}

package znanje;

import java.util.Scanner;

public class Problem001 {
	
	// 1. Napisati program za upis i ispis broja.
	
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		int a = input.nextInt();               //uèitaj broj
//		
//		System.out.println("Broj je: " + a);   //ispis broja
//		
//		input.close();
		
		// 2. varijanta
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Broj: ");           //ispis što treba uèitati
		int a = input.nextInt();                //uèitaj broj
		
		System.out.println("Broj je: " + a);    //ispis broja
		
		input.close();
	}

}

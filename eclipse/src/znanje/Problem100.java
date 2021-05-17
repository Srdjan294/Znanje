package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem100 {
	
	// 55. Napisati program koji uèitava dvoznamenkasti broj i ispisuje odvojeno znamenke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite dvoznamekasti broj: ");
		
		try {
			int a = input.nextInt();
		if(a >= 10 && a <= 99) {
			int d = a/10;
			int j = a%10;
			System.out.println(a + " = desetice: " + d + ", jedinice: " + j);
		}else if(a >= -99 && a <= -10) {
			int d = a/10;
			int j = a%10;
			System.out.println(a + " = desetice: " + d*-1 + ", jedinice: " + j*-1);
		}else {
			System.out.println("Niste unijeli dvoznamenkasti broj.");
		}
		}catch(InputMismatchException a) {
			System.out.println("Niste unijeli dvoznamenkasti broj.");
		}
		
		input.close();
	}

}

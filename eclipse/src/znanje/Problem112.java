package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem112 {
	
	// 66. Napisati program koji uèitava troznamenkasti broj i ispisuje znamenke unazad.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.println("Unesite troznamekasti broj: ");
				int a = input.nextInt();
				if(a >= 100 && a <= 999) {
					int s = a/100;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " - unazad: " + j + "" + d + "" + s);
				}else if(a >= -999 && a <= -100) {
					int s = a/100;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " -unazad: " + j*-1 + "" + d*-1 + "" + s*-1);
				}else {
					System.out.println("Niste unijeli troznamenkasti broj.");
				}
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli troznamenkasti broj.");
				@SuppressWarnings("unused")
				String c = input.next();
			}
		
			System.out.println("Želite li nastaviti d ili n?");
			String c = input.next();
		
			if(c.equalsIgnoreCase("d")) {
				continue;
			}
		
			if(c.equalsIgnoreCase("n")) {
				break;
			}
		
			while(!c.equalsIgnoreCase("d") && !c.equalsIgnoreCase("n")) {
			System.out.println("Odaberite d za da ili n za ne.");
			c = input.next();
			}
		
		}
		
		input.close();
	}

}

package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem117 {
	
	// 69_2. Napisati program koji uèitava peteroznamenkasti broj i ispisuje znamenke unazad.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.println("Unesite peteroznamekasti broj: ");
				int a = input.nextInt();
				if(a >= 10000 && a <= 99999) {
					int dt = a/10000;
					int t = (a/1000)%10;
					int s = (a/100)%10;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " - unazad: " + j + "" + d + "" + s + "" + t + "" + dt);
				}else if(a >= -99999 && a <= -10000) {
					int dt = a/10000;
					int t = (a/1000)%10;
					int s = (a/100)%10;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " - unazad: " + j*-1 + "" + d*-1 + "" + s*-1 + "" + t*-1 + "" + dt*-1);
				}else {
					System.out.println("Niste unijeli peteroznamenkasti broj.");
				}
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli peteroznamenkasti broj.");
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

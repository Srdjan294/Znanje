package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem108 {
	
	// 62. Napisati program koji u�itava dvoznamenkasti broj i ispisuje sumu znamenki.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.println("Unesite dvoznamekasti broj: ");
				int a = input.nextInt();
				if(a >= 10 && a <= 99) {
					int d = a/10;
					int j = a%10;
					System.out.println(a + " - zbroj znamenki: " + (j + d));
				}else if(a >= -99 && a <= -10) {
					int d = a/10;
					int j = a%10;
					System.out.println(a + " - zbroj znamenki: " + (j*-1 + d*-1));
				}else {
					System.out.println("Niste unijeli dvoznamenkasti broj.");
				}
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli dvoznamenkasti broj.");
				@SuppressWarnings("unused")
				String c = input.next();
			}
		
			System.out.println("�elite li nastaviti d ili n?");
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

package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem110 {
	
	// 64. Napisati program koji uèitava dvoznamenkasti broj i ispisuje produkt znamenki 
	//     i kvocijent prve i druge znamenke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.println("Unesite dvoznamekasti broj: ");
				int a = input.nextInt();
				if(a >= 10 && a <= 99) {
					double d = a/10;
					double j = a%10;
					System.out.println(a + " - produkt znamenki: " + (d * j) + "\n" +
										"kvocijent prve i druge znamenke: " + (d / j));
				}else if(a >= -99 && a <= -10) {
					double d = a/10;
					double j = a%10;
					System.out.println(a + " - produkt znamenki: " + ((d*-1) * (j*-1)) + "\n" +
							"kvocijent prve i druge znamenke: " + ((d*-1) / (j*-1)));
				}else {
					System.out.println("Niste unijeli dvoznamenkasti broj.");
				}
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli dvoznamenkasti broj.");
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

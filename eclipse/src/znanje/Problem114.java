package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem114 {
	
	// 68. Napisati program koji uèitava èetveroznamenkasti broj i ispisuje znamenke.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				System.out.println("Unesite èetveroznamekasti broj: ");
				int a = input.nextInt();
				if(a >= 1000 && a <= 9999) {
					int t = a/1000;
					int s = (a/100)%10;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " - znamenke: \n"
										+ "tisuæice: " + t + "\n"
										+ "stotice: " + s + "\n"
										+ "desetice: " + d + "\n"
										+ "jedinice: " + j);
				}else if(a >= -9999 && a <= -1000) {
					int t = a/1000;
					int s = (a/100)%10;
					int d = (a/10)%10;
					int j = a%10;
					System.out.println(a + " - znamenke: \n"
										+ "tisuæice: " + t*-1 + "\n"
										+ "stotice: " + s*-1 + "\n"
										+ "desetice: " + d*-1 + "\n"
										+ "jedinice: " + j*-1);
				}else {
					System.out.println("Niste unijeli èetveroznamenkasti broj.");
				}
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli èetveroznamenkasti broj.");
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

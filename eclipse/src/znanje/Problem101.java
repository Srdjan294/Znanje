package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem101 {
	
	// 56. Napisati program za cjelobrojno dijeljenje sa 100 i 10 kao i 
	//     izraèunavanje ostatka 100 i 10 troznamenkastog broja.
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("Unesite troznamenkasti broj: ");
		
			try {
				int a = input.nextInt();
		
				if(a >= 100 && a <= 999) {
			
					int aDiv10 = a/10;
					int aDiv100 = a/100;
					int aMod10 = a%10;
					int aMod100 = a%100;
			
					System.out.println(a + " = DIV 10: " + aDiv10 + 
									   ", DIV 100: " + aDiv100 + 
									   ", MOD 10: " + aMod10 + 
									   ", MOD 100: " + aMod100);
			
				}else if(a >= -999 && a <= -100) {
					
					int aDiv10 = a/10;
					int aDiv100 = a/100;
					int aMod10 = a%10;
					int aMod100 = a%100;
			
					System.out.println(a + " = DIV 10: " + aDiv10*-1 + 
									   ", DIV 100: " + aDiv100*-1 + 
									   ", MOD 10: " + aMod10*-1 + 
									   ", MOD 100: " + aMod100*-1);
			
				}else {
					System.out.println("Niste unijeli troznamenkasti broj.");
				}
		
			}catch(InputMismatchException a) {
			
				System.out.println("Niste unijeli broj.");
				
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
		
		while(!c.equalsIgnoreCase("d") && !c.equalsIgnoreCase("n")){
			System.out.println("Odaberite d za da ili n za ne.");
			c = input.next();
		}
		
		}
		
		input.close();
	}

}

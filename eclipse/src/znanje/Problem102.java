package znanje;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Problem102 {
	
	// 57. Napisati program za izraèunavanje: a MOD 2, a MOD -2, -a MOD 2, -a MOD -2
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(true) {
			
			try {
				
				System.out.println("Unesite cijeli broj: ");
				int a = input.nextInt();
		
				System.out.println("a MOD 2: " + a%2 + "\n" + 
								   "a MOD -2: " + a%-2 + "\n" + 
						           "-a MOD 2: " + -a%2 + "\n" + 
						           "-a MOD -2: " + -a%-2);
			
				}catch(InputMismatchException a) {
					System.out.println("Niste unijeli cijeli broj.");
					
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

package znanje;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Problem103 {
	
	// 58. Napisati program za izraèunavanje: INT (a/2), INT (a/-2), INT (-a/2), INT (-a/-2)
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(true) {
			
			try {
				
				System.out.println("Unesite broj: ");
				BigDecimal a = input.nextBigDecimal();
				
				System.out.println("INT (a/2): " + a.intValue()/2 + "\n" + 
							       "INT (a/-2): " + a.intValue()/-2 + "\n" + 
							       "INT (-a/2): " + -a.intValue()/2 + "\n" + 
							       "INT (-a/-2): " + -a.intValue()/-2);	
				
			} catch (InputMismatchException a) {
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
			
			while(!c.equalsIgnoreCase("d") && !c.equalsIgnoreCase("n")) {
				System.out.println("Odaberite d za da ili n za ne.");
				c = input.next();
			}
		}
		
		input.close();
		
	}

}

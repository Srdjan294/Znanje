package znanje;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Problem123 {
	
	// 82. Napisati program koji izvodi zamjenu vrijednosti dva broja bez korištenja privremene ili treæe varijable.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(true) {
			
			try {
				System.out.println("##ZAMJENA DVA BROJA##");
				System.out.println("Unesite prvi broj: ");
				BigDecimal x = input.nextBigDecimal();
				System.out.println("Unesite drugi broj: ");
				BigDecimal y = input.nextBigDecimal();
				
				System.out.println("Prije zamjene: \nx = " + x + "\ny = " + y);
				
				x = x.add(y);
				y = x.subtract(y);
				x = x.subtract(y);
				
				System.out.println("Poslije zamjene: \nx = " + x + "\ny = " +y);
				
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

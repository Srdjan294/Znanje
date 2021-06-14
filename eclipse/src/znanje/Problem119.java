package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem119 {
	
	// 71. Uèitati 3 cijela broja i izraèunati aritmetièku sredinu koristeæi samo varijable x, s i as.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				int[] x = new int[2];
				System.out.println("Unesite tri cijela broja: ");
				System.out.println("Prvi broj: ");
				x[0] = input.nextInt();
				
				System.out.println("Drugi broj: ");
				int s = input.nextInt();
				
				double as = x[0] + s;
				
				System.out.println("Treæi broj: ");
				x[1] = input.nextInt();
				
				as = (as + x[1]) / 2;
				
				System.out.println("Aritmetièka sredina brojeva " + x[0] + ", " + s + ", " + x[1] + " je " + as);
			
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
		
			while(!c.equalsIgnoreCase("d") && !c.equalsIgnoreCase("n")) {
			System.out.println("Odaberite d za da ili n za ne.");
			c = input.next();
			}
		
		}
		
		input.close();
		
	}

}

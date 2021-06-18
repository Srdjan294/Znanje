package znanje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem121 {
	
	// 73. Uèitati 4 prirodna broja i izraèunati drugi korijen sume koristeæi samo varijable x, s i korijen.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			try {
				int s = 0;
				int[] x = new int[4];
				System.out.println("Unesite èetiri prirodna broja: ");
				System.out.println("Prvi broj:");
				x[0] = input.nextInt();
				System.out.println("Drugi broj:");
				x[1] = input.nextInt();
				System.out.println("Treæi broj:");
				x[2] = input.nextInt();
				System.out.println("Èetvrti broj:");
				x[3] = input.nextInt();
				if(x[0] > 0 && x[0] > 0 && x[0] > 0 && x[0] > 0) {
					
					s = x[0] + x[1] + x[2] + x[3];
					
					System.out.println("Suma brojeva " + x[0] + ", " + x[1] +
							", " + x[2] + ", " + x[3] + " je " + s + ". Korijen sume je " + Math.sqrt(s));
				}else {
					System.out.println("Niste unijeli prirodni broj.");
					if(x[0] <= 0) {
						System.out.println("x[0] = " + x[0]);
					}
					if(x[1] <= 0) {
						System.out.println("x[1] = " + x[1]);
					}
					if(x[2] <= 0) {
						System.out.println("x[2] = " + x[2]);
					}
					if(x[3] <= 0) {
						System.out.println("x[3] = " + x[3]);
					}
				}
				
			}catch(InputMismatchException a) {
				System.out.println("Niste unijeli prirodni broj.");
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

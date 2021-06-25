package znanje;

import java.util.Scanner;

public class Problem127 {
	
	// 111. Ispisati generirani troznamenkasti sluèajan broj.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((1000 - 100) * Math.random() + 100);
		
			System.out.println("Generiranje troznamenkastog broja:");
			System.out.println(broj);
			
			System.out.println("Želite li generirati novi broj: d ili n?");
			
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

package znanje;

import java.util.Scanner;

public class Problem132 {

	// 116. Napisati program koji generira dvoznamenkasti broj, ispi�e ga. Zatim ispi�e znamenke generiranog broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((100 - 10) * Math.random() + 10);
		
			System.out.println("Generiranje dvoznamenkastog broja:");
			System.out.println(broj);
			
			int d = broj/10;
			int j = broj%10;
			
			System.out.println("Znamenke: \ndesetice: " + d + "\njedinice: " + j);
			
			System.out.println("�elite li ponoviti: d ili n?");
			
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
			
			if(c.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		input.close();
	}
}

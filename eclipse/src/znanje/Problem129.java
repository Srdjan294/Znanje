package znanje;

import java.util.Scanner;

public class Problem129 {

	// 113. Zbrojiti dva generirana dvoznamenkasta sluèajna broja.
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj1 = (int)((100 - 10) * Math.random() + 10);
			int broj2 = (int)((100 - 10) * Math.random() + 10);
		
			System.out.println("Zbroj dva generirana dvoznamenkasta broja:");
			System.out.println(broj1 + " + " + broj2 + " = " + (broj1 + broj2) );
			
			System.out.println("Želite li ponoviti: d ili n?");
			
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

package znanje;

import java.util.Scanner;

public class Problem130 {
	
	// 114. Zbrojiti dva generirana troznamenkasta sluèajna broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj1 = (int)((1000 - 100) * Math.random() + 100);
			int broj2 = (int)((1000 - 100) * Math.random() + 100);
		
			System.out.println("Zbroj dva generirana troznamenkasta broja:");
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
			
			if(c.equalsIgnoreCase("n")) {
				break;
			}
			
		}
		input.close();
	}

}

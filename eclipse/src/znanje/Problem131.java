package znanje;

import java.util.Scanner;

public class Problem131 {
	
	// 115. Zbrojiti dva generirana èetveroznamenkasta sluèajna broja.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj1 = (int)((10000 - 1000) * Math.random() + 1000);
			int broj2 = (int)((10000 - 1000) * Math.random() + 1000);
		
			System.out.println("Zbroj dva generirana èetveroznamenkasta broja:");
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

package znanje;

import java.util.Scanner;

public class Problem128 {
	
	// 112. Ispisati generirani �etveroznamenkasti slu�ajan broj.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((10000 - 1000) * Math.random() + 1000);
		
			System.out.println("Generiranje �etveroznamenkastog broja:");
			System.out.println(broj);
			
			System.out.println("�elite li generirati novi broj: d ili n?");
			
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

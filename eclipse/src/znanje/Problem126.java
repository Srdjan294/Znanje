package znanje;

import java.util.Scanner;

public class Problem126 {

	// 110. Ispisati generirani dvoznamenkasti slu�ajan broj.
	//      Slu�ajan dvoznamenkasti broj se ra�una na osnovu izraza: Vrijednost = (max-min) * rnd + min
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((100 - 10) * Math.random() + 10);
		
			System.out.println("Generiranje dvoznamenkastog broja:");
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

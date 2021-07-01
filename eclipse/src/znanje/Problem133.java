package znanje;

import java.util.Scanner;

public class Problem133 {
	
	// 116_3. Napisati program koji generira dvoznamenkasti broj, ispiše ga. Zatim ispiše znamenke u obrnutom redoslijedu jednu ispod druge.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((100 - 10) * Math.random() + 10);
		
			System.out.println("Generiranje dvoznamenkastog broja:");
			System.out.println(broj);
			
			int d = broj/10;
			int j = broj%10;
			
			System.out.println("Znamenke obrnuto: \n" + j + "\n" + d);
			
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

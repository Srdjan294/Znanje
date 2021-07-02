package znanje;

import java.util.Scanner;

public class Problem134 {
	
	// 117. Napisati program koji generira troznamenkasti broj, ispiše ga. Zatim ispiše znamenke u obrnutom redoslijedu.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
			int broj = (int)((1000 - 100) * Math.random() + 100);
		
			System.out.println("Generiranje troznamenkastog broja:");
			System.out.println(broj);
			
			int s = broj/100;
			int d = (broj/10)%10;
			int j = broj%10;
			
			System.out.println("Znamenke obrnuto: " + j + "" + d +  "" + s);
			
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

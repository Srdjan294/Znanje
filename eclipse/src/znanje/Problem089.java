package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem089 {
	
	// 48. Izraèunati vrijednost sinusne i kosinusne funkcije za uèitani kut u radijanima.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite vrijednost kuta u radijanima: ");
		double radijan = input.nextDouble();
		
		double sinus = Math.sin(radijan);
		double kosinus = Math.cos(radijan);
		double stupnjevi = Math.toDegrees(radijan);
		
		System.out.println(radijan + " radijana u stupnjevima je: " + stupnjevi + ".\n" + 
						   "Sinus od " + radijan + " radijana je: " + sinus +  ".\n" + 
						   "Kosinus od " + radijan + " radijana je: " + kosinus + ".");
		
		input.close();
	}

}

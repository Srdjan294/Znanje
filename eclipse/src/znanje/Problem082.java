package znanje;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Problem082 {
	
	// 41. Napisati program za raèunanje godina starosti.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Unesite godinu roðenja (primjer: 1990): ");
		int godina = input.nextInt();
		System.out.println("Unesite mjesec roðenja (primjer: 4 ili 12): ");
		int mjesec = input.nextInt();
		System.out.println("Unesite dan roðenja (primjer: 3 ili 31): ");
		int dan = input.nextInt();
		
		LocalDate datumRodenja = LocalDate.of(godina, mjesec, dan);
		
		LocalDate trenutniDatum = LocalDate.now();
		
		Period starost = Period.between(datumRodenja, trenutniDatum);
		
		System.out.println("Datum roðenja: " + datumRodenja + "\n" +
						   "Godine: " + starost.getYears() + "\n" +
						   "Mjeseci: " + starost.getMonths() + "\n" + 
						   "Dani: " + starost.getDays());
		
		input.close();
	}

}

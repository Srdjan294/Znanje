package znanje;

import java.util.Scanner;

public class Problem008 {
	
//	3_1. Izracunati aritmeticku sredinu dva broja.
//
//	Opis programa: I Varijanta: Izracunava se suma int s = a + b. Zatim se u naredbi ispisa izracunava aritmeticka sredina s/2.
//	II Varijanta: Aritmeticka sredina se izracunava u posebnom izrazu. Zato sto je realna vrijednost koristimo 2. (double as = (a+b)/2. )
//	\t u naredbi System.out.print obzebjeduje razmak izmedu ispisa (TAB).
	
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Unesi broj a: ");
//		double a = input.nextDouble();
//		System.out.println("Unesi broj b: ");
//		double b = input.nextDouble();
//		
//		double s = a+b;  //suma dva broja
//		
//		System.out.println("Suma je " + s + "\tAritmetièka sredina dva broja je: " + s/2);  // \t razmak - TAB
//		
//		input.close();
		
		// 2. varijanta - izracunaj vrijednost pa je ispisi
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi broj a: ");
		double a = input.nextDouble();
		System.out.println("Unesi broj b: ");
		double b = input.nextDouble();
		
		double as = (a+b)/2;      //izracunavamo vrijednost aritmeticke sredine
		
		System.out.println("Suma je " + (a+b) + "\tAritmetièka sredina dva broja je " + as);
		
		input.close();
	}

}

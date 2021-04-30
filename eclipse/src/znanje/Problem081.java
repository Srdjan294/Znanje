package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem081 {
	
	// 40_4. Napisati program za pretvaranje velièine datoteke izraženu u megabyteima 
	//       ispisuje u kilobyteima.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite velièinu datoteke u megabyteima: ");
		int megabyte = input.nextInt();
		
		int kbDecimal = megabyte * 1000;
		int kbBinary = megabyte * 1024;
		
		System.out.println("Velièina " + megabyte + "MB u kilobyte(decimal) je: " + kbDecimal + 
						   "KB, a u kilobyte(binary) je: " + kbBinary + "KB.");
		
		input.close();
	}

}

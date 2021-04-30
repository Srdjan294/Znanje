package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem081 {
	
	// 40_4. Napisati program za pretvaranje veli�ine datoteke izra�enu u megabyteima 
	//       ispisuje u kilobyteima.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite veli�inu datoteke u megabyteima: ");
		int megabyte = input.nextInt();
		
		int kbDecimal = megabyte * 1000;
		int kbBinary = megabyte * 1024;
		
		System.out.println("Veli�ina " + megabyte + "MB u kilobyte(decimal) je: " + kbDecimal + 
						   "KB, a u kilobyte(binary) je: " + kbBinary + "KB.");
		
		input.close();
	}

}

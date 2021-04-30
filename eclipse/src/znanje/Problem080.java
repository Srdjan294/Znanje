package znanje;

import java.util.Locale;
import java.util.Scanner;

public class Problem080 {
	
	// 40_3. Napisati program za pretvaranje veli�ine datoteke izra�enu u 
	//       kilobyteima u veli�inu u byteima.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Unesite veli�inu datoteke u kilobyteima: ");
		int kilobyte = input.nextInt();
		
		int byteDecimal = kilobyte * 1000;
		int byteBinary = kilobyte * 1024;
		
		System.out.println("Veli�ina " + kilobyte + "KB u byteovima(decimal) je: " + byteDecimal + 
						   "B, a u byteovima(binary) je: " + byteBinary + "B.");
		
		input.close();
	}

}

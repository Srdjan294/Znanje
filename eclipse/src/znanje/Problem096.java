package znanje;

import java.util.Scanner;

public class Problem096 {
	
	// 51. Putovanje traje n sekundi. Izraèunaj koliko je to sati, minuta i sekundi.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Koliko sekundi traje putovanje: ");
		int n = input.nextInt();
		
		int h = n/3600;  // sati
		
		int ostatak = n%3600;  // ostatak u sekundama 
		
		int m = ostatak/60;    // minute
		
		int s =  ostatak%60;   // sekunde
		
		System.out.println(n + " sekundi je " + h + " sati, " + m + " minuta i " + s + " sekundi.");
		
		input.close();
	}

}

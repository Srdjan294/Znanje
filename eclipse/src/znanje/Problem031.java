package znanje;

import java.util.Scanner;

public class Problem031 {
	
	// 10.  Napisati program za izra�unavanje povr�ine pravokutnika.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice a pravokutnika: ");
		int a = input.nextInt();
		System.out.println("Unesi duljinu stranice b pravokutnika: ");
		int b = input.nextInt();
		
		int p = a*b;
		
		System.out.println("Povr�ina pravokutnika je: "+p);
		
		input.close();
	}

}

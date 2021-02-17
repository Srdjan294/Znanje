package znanje;

import java.util.Scanner;

public class Problem032 {

	// 11. Napisati program za izraèunavanje opsega pravokutnika
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi duljinu stranice a pravokutnika: ");
		int a = input.nextInt();
		System.out.println("Unesi duljinu stranice b pravokutnika: ");
		int b = input.nextInt();
		
		int o = 2*(a+b);
		
		System.out.println("Opseg pravokutnika je: "+o);
		
		input.close();
	}
}

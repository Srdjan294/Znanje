package znanje;

public class Problem105 {
	
	// 60. Napisati program koji izraèunava i ispisuje rezultate:
	//     1 + 7 MOD 3 * (2 + 7) DIV 2
	//     (1 + 7) MOD 3 * 2 + 7 DIV 2
	
	public static void main(String[] args) {
		
		System.out.println("1 + 7 MOD 3 * (2 + 7) DIV 2 : " + 1 + 7 % 3 * (2+7) / 2);
		System.out.println("(1 + 7) MOD 3 * 2 + 7 DIV 2 : " + (1+7) % 3 * 2 + 7 / 2);
	}

}

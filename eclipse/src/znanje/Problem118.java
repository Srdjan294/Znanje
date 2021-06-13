package znanje;

public class Problem118 {
	
	// 70. Napisati program koji izraèunava i ispisuje rezultate:
	//	   ROUND(11.7)
	//     ROUND(2.7)
	//     ROUND(-2.6)
	//     ROUND(-2.1)
	//     ROUND(2.2)
	//     1-ROUND(-1.9)
	
	public static void main(String[] args) {
		
		System.out.println("ROUND(11.7): " + Math.round(11.7));
		System.out.println("ROUND(2,7): " + Math.round(2.7));
		System.out.println("ROUND(-2.6):" + Math.round(-2.6));
		System.out.println("ROUND(-2.1): " + Math.round(-2.1));
		System.out.println("ROUND(2.2): " + Math.round(2.2));
		System.out.println("1-ROUND(-1.9): " + (1 - Math.round(-1.9)));
	}

}

package znanje;

public class Problem126 {

	// 110. Ispisati generirani dvoznamenkasti slu�ajan broj.
	//      Slu�ajan dvoznamenkasti broj se ra�una na osnovu izraza: Vrijednost = (max-min) * rnd + min
	
	public static void main(String[] args) {
		
		int broj = (int)((100 - 10) * Math.random() + 10);
		
		System.out.println(broj);
	}
}

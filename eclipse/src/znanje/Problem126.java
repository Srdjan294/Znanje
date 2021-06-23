package znanje;

public class Problem126 {

	// 110. Ispisati generirani dvoznamenkasti sluèajan broj.
	//      Sluèajan dvoznamenkasti broj se raèuna na osnovu izraza: Vrijednost = (max-min) * rnd + min
	
	public static void main(String[] args) {
		
		int broj = (int)((100 - 10) * Math.random() + 10);
		
		System.out.println(broj);
	}
}

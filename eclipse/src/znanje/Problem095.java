package znanje;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//import java.util.Scanner;

public class Problem095 {
	
	// 50. Napisati program koji vrijeme uèitano u satima, 
	//     minutama i sekundama izraèunava i ispisuje u sekundama.
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
		
		System.out.println(LocalTime.now().truncatedTo(ChronoUnit.SECONDS).format(dtf));
		System.out.println(LocalTime.now().getHour()*3600 + LocalTime.now().getMinute()*60 + 
						   LocalTime.now().getSecond() + " sekundi.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite sate: ");
		int h = input.nextInt();
		System.out.println("Unesite minute: ");
		int m = input.nextInt();
		System.out.println("Unesite sekunde: ");
		int s = input.nextInt();
		
		int sec = h*3600 + m*60 + s;
		
		System.out.println(h + " sati, " + m + " minuta, " + s + " sekundi: " + sec + " sekundi.");
		
		input.close();
		
		
	}

}

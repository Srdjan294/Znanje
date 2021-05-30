package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Problem106 {
	
	// 61-01. Uèitati vrijednost kuta u radijanima i ispisati sinus i kosinus datog kuta.
	
	public static BigDecimal sine(BigDecimal x) {
        BigDecimal lastVal = x.add(BigDecimal.ONE);
        BigDecimal currentValue = x;
        BigDecimal xSquared = x.multiply(x);
        BigDecimal numerator = x;
        BigDecimal denominator = BigDecimal.ONE;
        int i = 0;

        while (lastVal.compareTo(currentValue) != 0) {
            lastVal = currentValue;

            int z = 2 * i + 3;

            denominator = denominator.multiply(BigDecimal.valueOf(z));
            denominator = denominator.multiply(BigDecimal.valueOf(z - 1));
            numerator = numerator.multiply(xSquared);

            BigDecimal term = numerator.divide(denominator,5,RoundingMode.HALF_UP);

            if (i % 2 == 0) {
                currentValue = currentValue.subtract(term);
            } else {
                currentValue = currentValue.add(term);
            }

            i++;
        }
        return currentValue;
    }
	
	public static BigDecimal cosine(BigDecimal x) {

        BigDecimal currentValue = BigDecimal.ONE;
        BigDecimal lastVal = currentValue.add(BigDecimal.ONE);
        BigDecimal xSquared = x.multiply(x);
        BigDecimal numerator = BigDecimal.ONE;
        BigDecimal denominator = BigDecimal.ONE;
        int i = 0;

        while (lastVal.compareTo(currentValue) != 0) {
            lastVal = currentValue;

            int z = 2 * i + 2;

            denominator = denominator.multiply(BigDecimal.valueOf(z));
            denominator = denominator.multiply(BigDecimal.valueOf(z - 1));
            numerator = numerator.multiply(xSquared);

            BigDecimal term = numerator.divide(denominator,5,RoundingMode.HALF_UP);

            if (i % 2 == 0) {
                currentValue = currentValue.subtract(term);
            } else {
                currentValue = currentValue.add(term);
            }
            i++;
        }

        return currentValue;
    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		while(true) {
			
			try {
				
				System.out.println("Unesite vrijednost kuta u radijanima: ");
				BigDecimal a = input.nextBigDecimal();
				
				System.out.println("sin("+a+"):" + sine(a) + "\n" + 
								   "cos("+a+"):" + cosine(a));	
				
			} catch (InputMismatchException a) {
				System.out.println("Niste unijeli broj.");
				
				@SuppressWarnings("unused")
				String c = input.next();
			}
			
			System.out.println("Želite li nastaviti d ili n?");
			String c = input.next();
			
			if(c.equalsIgnoreCase("d")) {
				continue;
			}
			
			if(c.equalsIgnoreCase("n")) {
				break;
			}
			
			while(!c.equalsIgnoreCase("d") && !c.equalsIgnoreCase("n")) {
				System.out.println("Odaberite d za da ili n za ne.");
				c = input.next();
			}
		}
		
		input.close();
	}	
}



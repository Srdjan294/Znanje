package znanje;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Problem093 {
	
	// 49_3. Napisati program koji za uèitano x ispisuje vrijednost y po formuli:
	//       y = tg x
	
	public static BigDecimal tangent(BigDecimal x) {

        BigDecimal sin = sine(x);
        BigDecimal cos = cosine(x);

        return sin.divide(cos,5,RoundingMode.HALF_UP);
    }
	
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
		
		System.out.println("Unesite x (radijani): ");
		BigDecimal x = input.nextBigDecimal();
		
		BigDecimal y = tangent(x);
		
		System.out.println("Rješenje y=tg(x) : " + y);
		
		input.close();
	}
	
	

}

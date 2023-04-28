import java.util.Scanner;
public class CCValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		long ccNumber = input.nextLong();

		int digit1 = 0, digit2 = 0, numDigits = 0, sumOfDoubleOdds = 0, sumOfEvens = 0;

		while (ccNumber > 0) {
			digit2 = digit1;
			digit1 = (int) (ccNumber % 10);

			if (numDigits % 2 == 0) {
				sumOfEvens += digit1;
			} else {
				int multiple = 2 * digit1;
				sumOfDoubleOdds += (multiple / 10) + (multiple % 10);
			}

			ccNumber /= 10;
			numDigits++;
		}

		boolean isValid = (sumOfEvens + sumOfDoubleOdds) % 10 == 0;
		int firstTwoDigits = digit1 * 10 + digit2;

		if (digit1 == 4 && numDigits >= 13 && numDigits <= 16 && isValid) {
			System.out.println("VISA");
		} else if (firstTwoDigits >= 51 && firstTwoDigits <= 55 && numDigits == 16 && isValid) {
			System.out.println("MASTERCARD");
		} else if ((firstTwoDigits == 34 || firstTwoDigits == 37) && numDigits == 15 && isValid) {
			System.out.println("AMEX");
		} else {
			System.out.println("INVALID");
		}
	}
}

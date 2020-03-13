package prog27;

import java.util.Random;

public class GenerateRandomsNumbers {

	static int x = 4;
	static int y = 3;

	public GenerateRandomsNumbers() {
	}

	public static int getRandomNumber() {

		int min = 10;
		int max = 99;
		Random rand = new Random();

		int RandomNumber = rand.nextInt((max - min) + 1) + min;

		return RandomNumber;

	}

	// Is the number in the range?
	public static boolean isInTheRange(int randomNumber) {

		if ((randomNumber > 0) && (randomNumber < 100)) {

			return true;
		}

		return false;
	}

	// Is the number < 10 - one digit number
	public static boolean isOneDigitNumber(int number) {

		if (number < 10) {
			return true;
		}

		return false;

	}

	// print to numbers in the right format
	public static String printNumbersFormat() {

		StringBuilder str = new StringBuilder();
		int number1 = getRandomNumber();
		int number2 = getRandomNumber();
		String printNumber1;
		String printNumber2;
		printNumber1 = String.format("%3d", number1);
		printNumber2 = String.format("%2d", number2);
		str.append((printNumber1 + "  " + "\n" + "+" + printNumber2 + "  " + "\n" + "___"));
		return str.toString();

	}

	public static void getExercises() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 1; j++) {

				System.out.printf("%-20s" ,printNumbersFormat());
			}
			System.out.println();
		}
		// System.out.print(printNumbersFormat());

	}

	public static void main(String[] args) {

		GenerateRandomsNumbers.getExercises();

	}

}
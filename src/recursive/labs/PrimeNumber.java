package recursive.labs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		//System.out.println(obj.primeNumber(3));
		//System.out.println(obj.primeNumberUltil(50));
		obj.primeNumberUltil(50);

	}

	boolean primeNumber(int x) {
		if (x <= 1) {
			return false;
		}

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}

		}
		return true;

	}

	void primeNumberUltil(int x) {
		for (int i = 2; i <= 50; i++) {
			if (primeNumber(i, i / 2) == true) {
				System.out.println(i);
			}

		}

	}

	private static boolean primeNumber(int number, int i) {

		if (i == 1) {
			return true;
		} else if (number % i == 0) {
			return false;
		} else
			return primeNumber(number, i - 1);
	}
}

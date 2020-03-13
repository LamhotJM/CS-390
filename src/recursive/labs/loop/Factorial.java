package recursive.labs.loop;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialWithoutRecursion(5));

	}

	private int factorialWithoutRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		// implement
		int result = 1;
		for (int i = 1; i <= n; ++i) {
			result = result * i;
		}

		return result;
	}

}

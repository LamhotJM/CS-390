package recursive.labs.loop;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fib(9));
		System.out.println(f.fibWithoutRecursion(9));
	}

	private int fibWithoutRecursion(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return 0;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	private int fib(int n) {
		int store[];
		store = new int[n + 1];
		store[0] = 0;
		store[1] = 1;
		for (int i = 2; i <= n; i++) {

			store[i] = store[i - 1] + store[i - 2];
		}
		// implement

		return store[n];
	}
}

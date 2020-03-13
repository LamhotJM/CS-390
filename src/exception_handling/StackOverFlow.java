package exception_handling;

import prog22.RandomNumbers;

class StackOverFlow {
	public static void main(String[] args) throws InterruptedException  {
		try {
			new StackOverFlow();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	StackOverFlow() throws InterruptedException {
		recurse("Hello");
	}

	String recurse(String s) {
		if (s == null)
			return null;
		int r = RandomNumbers.getRandomInt();
		int n = s.length();
		if (r % 2 == 0)
			return recurse(s.substring(0, n / 2));
		else {
			return recurse(s.substring(n / 2, n));
		}
	}
}
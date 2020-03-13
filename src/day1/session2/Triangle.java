package day1.session2;

public class Triangle {
	public static void main(String args[]) {

		stars(5);
	}

	static void stars(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-10s", "*");
			}
			System.out.println();
		}

	}

}

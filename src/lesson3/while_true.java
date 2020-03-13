package lesson3;

import java.util.Scanner;

public class while_true {

	public static void main(String args[]) {
		while_true_();
	}

	static void while_true_() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.print("Input the number! ");
			int input = sc.nextInt();
			sum = sum +input;
			if (input <= 0) {
				break;
			}
		}
		System.out.print(sum);
		sc.close();
	}

}

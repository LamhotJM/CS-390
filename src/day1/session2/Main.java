package day1.session2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// intSample();
		Integer x = 3;
		int y = Integer.valueOf(x);
		System.out.print(y);
		int b = 3;
		Integer c = Integer.valueOf(b);
		System.out.print(c);
		// switch_(1);
		// ternary(10);
		// scan();
		// vowel("lamhot") ;
		// intSample();

	}

	public static void intSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick an integer in the range 1..9 ");
		int input = sc.nextInt();
		String str;
		sc.close();
		switch (input % 2) {
		case 0:
			str = "You choose an even number";
			break;
		default:
			str = "You choose an odd number";
			break;

		}
		System.out.println(str);

	}

	void x(int x) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);

		}
	}

	static void switch_(int a) {
		int x = 0;
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
			break;
		}
		System.out.println("x value ->" + x);
	}

	static void ternary(int a) {
		String str = a % 2 == 0 ? "Even " : "odd";
		System.out.println("Type ->" + str);
	}

	static void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name:");
		// String x = sc.next(); //-> Only one
		String x = sc.nextLine();// -> Only one
		System.out.println("you wrote: " + x);
		System.out.print("Type your age:");
		int age = sc.nextInt();
		System.out.println("you wrote: " + age);
		sc.close();

	}

	static void vowel(String x) {
		System.out.println("index" + x.indexOf(1));
		char ch;
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			ch = x.charAt(i);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
				count++;
			}
		}
		System.out.print("Count =" + count);
		System.out.println();
		float val = 195500.04f;
		// String currency = format.format(number);;
		System.out.printf("You owe me $%,1.2f", val);

	}

}

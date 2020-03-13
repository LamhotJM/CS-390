package day2.array;

import java.util.Stack;

public class PalindromStack {
	public static void main(String args[]) {
		poli("mum");
	}

	static void poli(String str) {
		Stack<Character> poli = new Stack<Character>();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			poli.push(ch);
		}
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!poli.peek().equals(ch)) {
				System.out.print("not polindrom");
				break;
			}

			poli.pop();
			System.out.print("polindrom");
			break;

		}

	}

}

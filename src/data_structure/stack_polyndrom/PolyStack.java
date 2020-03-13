package data_structure.stack_polyndrom;

import java.util.Stack;

public class PolyStack {

	public static void main(String args[]) {

		PolyStack ps = new PolyStack();
		System.out.println(ps.isPolyndrom("madam"));

	}

	public boolean isPolyndrom(String s) {
		Stack<Character> n = new Stack<Character>();

		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			n.push(ch);
		}
		
		char pop;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			pop = (char) n.peek();
			n.pop();
			if(ch!= pop)
			{
				return false;
			}
		}
		return true;

	}

}

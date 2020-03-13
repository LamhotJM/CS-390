package day2.array;

public class BuilderPalindrom {
	public static void main(String args[]) {
		String b = "MOM";
		StringBuilder x = new StringBuilder();
		x.append(b);
		if (b.equals(x.reverse().toString())) {
			System.out.print("palindrome");
		} else {
			System.out.print("not palindrome");
		}

	} 

}

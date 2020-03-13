package prog25;

public class prog5 {
	public static void main(String args[]) {
		prog5 obj = new prog5();
		System.out.print(obj.reverse("lamhot"));
	}

	public String reverse(String str) {
		if (str == null) {
			return null;
		}
		char ch;
		String new_str ="";

		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			new_str +=ch;
		}
		
		return new_str;
	}

}

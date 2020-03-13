package recursive.labs;

public class reverse_prog {

	StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// reverse("hello");
		reverse_prog res = new reverse_prog();
		System.out.println(res.reverse("hello"));

		System.out.println(res.reverseUtil("hello"));

	}

	public String reverse(String str) {
		if ((str == null) || (str.length() == 0))
			return str;
		String first = "" + str.charAt(0);
		return reverse(str.substring(1)) + first;

	}

	public String reverseUtil(String str) {

		return reverseUlitity(str, str.length() - 1);
	}

	private String reverseUlitity(String str, int len) {
		if (len < 0) {
			return sb.toString();
		}

		sb.append(str.charAt(len));

		return reverseUlitity(str, len-1);
	}

}

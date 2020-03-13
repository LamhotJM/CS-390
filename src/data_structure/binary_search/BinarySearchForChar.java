package data_structure.binary_search;

public class BinarySearchForChar {

	public static void main(String[] args) {

		System.out.println("a? " + BinarySearchForChar.binarySearch("abc", 'a'));
		System.out.println("a? " + BinarySearchForChar.binarySearch("abc", 'd'));
	}

	public static boolean binarySearch(String s, char c) {
		if (s.length() == 1) {
			return true;
		}
		// implement
		int left = 0;
		int right = 0;
		return binarySearchRecursive(c, s, left, right);
	}

	public static boolean binarySearchold(String s, char c) {
		// implement
		int left = 0;
		int right = s.length() - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (s.charAt(mid) == c) {
				return true;
			} else if (c < s.charAt(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
		return false;
	}

	public static boolean binarySearchRecursive(char c, String s, int left, int right) {

		int middle = (left + right) / 2;

		if (right < left) {
			return false;
		}

		if (c < s.charAt(middle)) {
			return binarySearchRecursive(c, s, left, middle - 1);
		}

		if (c > s.charAt(middle)) {
			return binarySearchRecursive(c, s, middle + 1, right);
		}

		if (c == s.charAt(middle)) {
			return true;
		}

		return false;
	}

}
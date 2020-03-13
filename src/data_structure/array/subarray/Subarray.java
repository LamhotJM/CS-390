package data_structure.array.subarray;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "A", "C", "E" };
		String[] arr2 = { "A", "B", "C", "D", "E" };
		String[] arr3 = { "A", "C", "F" };
		System.out.println("Is arr1 a subarray of 2? (expected answer : yes) " + isSubArray(arr1, arr2));
		System.out.println("Is arr1 a subarray of 2? (expected answer : no) " + isSubArray(arr3, arr2));
	}

	public static boolean isSubArray(String[] arr1, String[] arr2) {
		if (arr1 == null && arr2 == null)
			return true;
		for (String str1 : arr1) {
			if (!isSub(arr2, str1)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isSub(String[] arr, String str) {
		for (String strLoop : arr) {
			if (strLoop == str) {
				return true;
			}
		}
		return false;
	}

}

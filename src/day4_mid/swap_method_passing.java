package day4_mid;

public class swap_method_passing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		swap(num1, num2);
		System.out.println("num1 : " + num1 + " num2 : " + num2);

	}

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp; 
		System.out.println("x : " + x + " y : " + y);

	}

}

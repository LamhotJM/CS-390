package quiz_preparation;

import java.util.Arrays;

public class switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 3;
		switch (value) {
		case 1:
			System.out.print("Value 1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
			break;
		}

		String x = "";
		x = value % 2 == 0 ? "even" : "odd";
		//System.out.println(x);
		
		String sub = "a ";
	//	System.out.println(sub.substring(2));//line s
		//System.out.println(sub.substring(2,4));//li
		System.out.println(sub.charAt(0));//li
		
		char[] chars= "lamhot".toCharArray();
		System.out.println("chars" + Arrays.toString(chars));
		
		System.out.printf("%,2.2f", 50000.099);
		
	}

}

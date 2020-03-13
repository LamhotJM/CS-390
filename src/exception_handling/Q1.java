package exception_handling;

public class Q1 {

	public static void main(String args[]) {

		
		// should be in order
		try {
			System.out.println("hello 1");

		} catch (ArithmeticException a) {
			System.out.println("hello");

		} catch (Exception e) {
			System.out.println("hello");
		}
		
		///not best practice
 finally {
			System.out.println("hello 1");
		}
	}

}

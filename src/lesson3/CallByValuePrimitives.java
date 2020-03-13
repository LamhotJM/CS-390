package lesson3;

public class CallByValuePrimitives {

	public static void main(String args[]) {
		CallByValuePrimitives x = new CallByValuePrimitives();
		
		int num = 50;
		//int b
		x.triple(num);
		System.out.println(num);
		System.out.print(x.triple(num));
		
	}

	public int triple(int x) {
		x = 3 * x;
		return x;
	}

}

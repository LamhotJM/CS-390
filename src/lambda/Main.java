package lambda;

public class Main {
	public static void main(String args[]) {
		TestInterface obj = (int x) -> System.out.println(2 * x);
		
		TestInterface obj1 = s -> System.out.println() ;
		
		obj1.normalFun();

		// This calls above lambda expression and prints 10.
		obj.abstractFun(5);
		
		
	
	}

}

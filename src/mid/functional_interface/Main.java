package mid.functional_interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";

		Square x = (String s) -> s;
		

		// parameter passed and return type must be
		// same as defined in the prototype
		
	    System.out.println(x.calculate(a));
	}

}

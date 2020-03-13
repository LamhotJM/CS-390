package day4_mid;

public class ClassE {
	
	private static int superInt= SuperIntMethod();
	private int number=0;
	
	private int number1=sum();
	
	
	private static int SuperIntMethod() {
		// TODO Auto-generated method stub
		System.out.println("3-Initializing static super int");
		return 1;
	}
	private int sum() {
		// TODO Auto-generated method stub
		System.out.println("hello from sum");
		return 1;
	}
	ClassE(int number)
	{
		this();
		this.number= number;
		System.out.println("4-Running class E constructor");
	}

	public ClassE() {
		System.out.println("5-Running class E constructor");
		
	}
	{
		System.out.println("6-Number =" + number);
		System.out.println("2-Running super object initialization block");
	}
	static {
		System.out.println("1-Executing super static block");
		
	}
	public static void main(String[] args) {
		new ClassE(3);

	}



}

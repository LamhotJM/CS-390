package day5.session1;

class SuperClass{
	public SuperClass()
	{
		System.out.println("this is superclass constructor");
	}
	
	public SuperClass(String a)
	{
		System.out.println("this is superclass constructor");
	}
	
}
public class SubClass  extends SuperClass{
	
	public SubClass()
	{
		System.out.println("this is subclass constructor");
		
	}
	
	public SubClass(String x)
	{
		System.out.println("this new String");
		System.out.println("this is subclass constructor");
		
	}

	public static void main(String[] args) {
		new SubClass();
	}

}

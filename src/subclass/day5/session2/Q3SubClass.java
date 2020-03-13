package subclass.day5.session2;

class Q3SuperClass{
	
	public Q3SuperClass()// if you delete this constructor, then would be error
	{}
	
	
	public Q3SuperClass(String a)
	{
		System.out.println("this is superclass constructor");
	}
	
}
public class Q3SubClass  extends Q3SuperClass{

	
	public static void main(String[] args) {
		new Q3SubClass();
	}

}

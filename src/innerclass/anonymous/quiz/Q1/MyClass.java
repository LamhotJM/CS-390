package innerclass.anonymous.quiz.Q1;

public class MyClass {
	private String s = "hello";
	public static void main(String args[])
	{
		new MyClass();
	}
	MyClass()
	{
		MyInnerClass inner= new MyInnerClass();
		System.out.println(inner.intval);
		inner.innerMethod();
		
	}
	
	private class MyInnerClass
	{
		private int intval=3;
		private void innerMethod()
		{
			System.out.println(s);
		}
	}
	
	


}

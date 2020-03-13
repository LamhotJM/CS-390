package innerclass.prob1.top;

public class MyClass2 {
	private String s = "hello";

	public static void main(String[] args) {
		new MyClass();
	}

	MyClass2() {
//access static methods in the usual way MyStaticNestedClass.myStaticMethod();
//access instance methods in the usual way too //except that now private methods are also accessible MyStaticNestedClass cl = new MyStaticNestedClass(); cl.myOtherMethod();
//as with inner classes, private instance vbles are accessible
		// int y = cl.x;
	}

	static class MyStaticNestedClass {
		private int x = 0;

	//	static void myStaticMethod() {
        // String t = s; //compiler error -- no access }
      //   //private void myOtherMethod() {
		}
	//}
	//}

	static class AnotherClass {
		public static void main(String[] args) {
			MyClass2.MyStaticNestedClass cl = new MyClass2.MyStaticNestedClass(); // OK MyClass m = new MyClass();
//the following is illegal-- compiler error MyClass.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();
		}
	}
}

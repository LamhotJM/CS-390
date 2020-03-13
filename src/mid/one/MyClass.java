package mid.one;

public class MyClass {
	public static void main(String[] args) {
		new MyClass();

	}

	MyClass() {
		AnotherClass a = new AnotherClass(this);

	}

	private void MyMethod() {
		System.out.println("hello");
	}

	class AnotherClass {
		AnotherClass(MyClass m) {
			m.MyMethod();
		}
	}

}

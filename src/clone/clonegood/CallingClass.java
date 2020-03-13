package clone.clonegood;

public class CallingClass {

	// public MyClass tryToClone(MyClass cl) {
	// return cl;
	// }

	public MyClass tryToClone(MyClass cl) {
		try {
			// ok since clone() is now a public method in MyClass return (MyClass)
			// cl.clone();
			return (MyClass) cl.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public static void main(String[] args) {
		CallingClass cc = new CallingClass();
		MyClass cl = new MyClass();
		MyClass result = cc.tryToClone(cl);
		System.out.println(result.name);

	}
}
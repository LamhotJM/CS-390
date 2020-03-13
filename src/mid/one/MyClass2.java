package mid.one;

public class MyClass2 {
	static MyInnerClass c;

	public static void main(String[] args) {
		c = (new MyClass2()).new MyInnerClass();
		c.process();
	}

	private int value = 1;

	void process() {
		c.assign();
		c.print();
	}

	class MyInnerClass extends MyClass2 {

		private int n = 0;

		private void assign() {
			n = value;

		}

		void print() {
			System.out.println(n);
		}

	}
}

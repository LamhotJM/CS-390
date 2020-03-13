package exception_handling;
import java.io.IOException;
public class Test {

	class MyException extends Exception {
		public MyException() {
			super();
		}

		public MyException(String msg) {
			super(msg);
		}

	}

	public static void main(String[] args) {
		try {
			(new Test()).call();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void call() throws MyException {
		try {
			test();

		} catch (IOException e) {
			System.out.println(e.getMessage());
			throw new MyException("MyException");

		} finally {
			System.out.println("finally");
		}
	}

	private void test() throws IOException {
		throw new IOException("IOException");

	}

}

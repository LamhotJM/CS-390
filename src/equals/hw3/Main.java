package equals.hw3;

public class Main {

	public static void main(String args[]) {

		PersonWithJob withJob1 = new PersonWithJob("Joe",1994,2,2,500);
		PersonWithJob withJob2 = new PersonWithJob("Joe",1994,2,2,500);
		// true – using Person’s equals()
		// true – using Person’s equals()
		boolean theyreEqual1 = withJob1.equals(withJob2);
		boolean theyreEqual2 = withJob2.equals(withJob1);

		System.out.println(theyreEqual1);
		System.out.println(theyreEqual2);
	}

}

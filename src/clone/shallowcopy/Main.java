package clone.shallowcopy;

public class Main {
	public static void main(String[] args) {
		Job joesjob = new Job(40, "Carpenter");
		Person joe = new Person("Joe", joesjob);
		System.out.println(joe);
		try {
			Person joecopy = (Person) joe.clone();
			System.out.println(joecopy);
			joecopy.job.typeOfJob = "Painter";
           //modifies original object!
			System.out.println(joe);
		} catch (CloneNotSupportedException e) {
		}
		
		
		
	}
}

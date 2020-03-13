package objectsclass.lab2.prog23;


public class Professor extends DeptEmployee {
	
	private int numberOfPublications;

	public Professor(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}

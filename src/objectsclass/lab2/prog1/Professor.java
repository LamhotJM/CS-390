package objectsclass.lab2.prog1;

public class Professor  extends DeptEmployee{
	public Professor(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		// TODO Auto-generated constructor stub
	}

	private int numOfPublications;

	public int getNumOfPublications() {
		return numOfPublications;
	}

	public void setNumOfPublications(int numOfPublications) {
		this.numOfPublications = numOfPublications;
	}

}

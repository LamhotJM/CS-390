package equals.case2;

public class Person {
	public Person(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof Person))
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

	public boolean equals2(Object aPerson) {
		if (aPerson == null) {
			return false;
		}
		if (!(aPerson instanceof Person)) {
			return false;
		}

		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;

	}

}

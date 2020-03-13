package equals.money1;

public class Person {
	public Person(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public boolean equalsOld(Object aPerson) {
		if (aPerson == null)
			return false;
		if (!(aPerson instanceof Person))
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson.getClass() != this.getClass())
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

}
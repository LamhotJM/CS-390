package equals.case1;

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
		if (aPerson == null) {
			return false;
		}
		if (!(aPerson instanceof Person)) {
			return false;
		}

		Person p = (Person) aPerson;
		boolean aequals = this.name.equals(p.name);
		return aequals;

	}

}

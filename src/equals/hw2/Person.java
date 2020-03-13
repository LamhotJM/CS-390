package equals.hw2;

import java.time.LocalDate;

public class Person {
	public Person(String name, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.dateBirth = LocalDate.of(year, month, dayOfMonth);
	}

	private String name;
	private LocalDate dateBirth;

	public String getName() {
		return name;
		
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson.getClass() != this.getClass()) 
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name) && this.dateBirth.equals(p.dateBirth);
		return isEqual;
	}


}

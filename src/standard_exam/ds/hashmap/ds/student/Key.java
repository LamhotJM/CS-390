package standard_exam.ds.hashmap.ds.student;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName,lastName);
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		
		return this.getFirstName().equals(other.getFirstName())&& this.getLastName().equals(other.getLastName());
	}
	
}

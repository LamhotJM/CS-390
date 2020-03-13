package objectsclass.lab2.prog1;
import java.time.LocalDate;

public class DeptEmployee {
	

	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public DeptEmployee(String name, double salary, int year, int month, int dayOfMonth) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, dayOfMonth);;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "DeptEmployee [name=" + name + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}

}

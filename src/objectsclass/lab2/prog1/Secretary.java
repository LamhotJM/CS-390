package objectsclass.lab2.prog1;

public class Secretary extends DeptEmployee {
	public Secretary(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		// TODO Auto-generated constructor stub
	}

	private double overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		return super.computeSalary() + 12 * overtimeHours;
	}

}

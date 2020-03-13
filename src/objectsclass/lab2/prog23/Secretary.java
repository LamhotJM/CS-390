package objectsclass.lab2.prog23;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;

	public Secretary(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		// TODO Auto-generated constructor stub
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary()
	{
		double sum =0.0;
		sum = (12* overtimeHours) + super.computeSalary();
		return sum;
	}

}

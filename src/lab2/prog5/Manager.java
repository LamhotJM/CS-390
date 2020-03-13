package lab2.prog5;

public class Manager extends Employee{
	
	

	public Manager(String name, double salary, int year, int month, int dayOfMonth) {
		super(name, salary, year, month, dayOfMonth);
		// TODO Auto-generated constructor stub
	}

	private double bonus;

	public double getBonus() {
		return bonus;
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}

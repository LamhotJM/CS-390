package standard_exam.polymorphism;

public class Circle implements ClosedCurved{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}

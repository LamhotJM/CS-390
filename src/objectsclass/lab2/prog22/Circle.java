package objectsclass.lab2.prog22;
 class Circle {

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * (radius * radius);
	}

}

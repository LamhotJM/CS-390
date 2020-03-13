package objectsclass.lab2.prog22;

public class Cylinder extends Circle {
	private double height;

	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cylinder(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height= height;
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		double vol =0.0;
		vol = Math.PI *  super.getRadius()*super.getRadius()* height;
		return vol;
	}

	
}

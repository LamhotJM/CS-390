package lab7_2;

public class Retangle extends ClosedCurve implements Polygon{
	
	public Retangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	private double width;
	private double length;

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width* length;
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2*width+ 2*length;
	}

}

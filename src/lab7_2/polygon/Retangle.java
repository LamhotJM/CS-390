package lab7_2.polygon;

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
	public double[] getArrayOfSides() {
		return new double[] {width,width, length, length};
	}



}

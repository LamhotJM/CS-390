package exception_handling.prog21_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurveException{
		validateSide(width,length);
		this.length = length;
		this.width = width;
	}
	private void validateSide(double width2, double length2) throws IllegalClosedCurveException{
		// TODO Auto-generated method stub
		if(width2 <=0 || length2<=0)
		{
			throw new  IllegalClosedCurveException(this.getClass().getName());
			
		}
		
	}
	double computeArea() {
		return width*length;
	}


}

package objectsclass.lab2.prog21;

public final class Retangle {
	private double width;
	private double height;
	
	public Retangle(double width,double length) {
		super();
		this.width = width;
		this.height= length;
	}
	
	
    public double getWidth() {
          return width;
}
    
    public double getLength() {
        return height;
}



	double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

}

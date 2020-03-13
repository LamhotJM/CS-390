package prog22;

public class Prog1 {
	public static void main(String args[])
	{
		
	int x = RandomNumbers.getRandomInt(1,9);
	System.out.println("Random number of x: " +x);
	System.out.println("Rnadom number πx of x:" + Math.pow(Math.PI, x));
	
	int y = RandomNumbers.getRandomInt(3,14);
	System.out.println("Random number of y: " +y);
	System.out.println("Rnadom number yπ of y:" + Math.pow(y,Math.PI));
	
	}
}

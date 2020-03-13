package prog23;

public class Prog3 {
	public static void main(String args[])
	{
		int sum = (int)(1.27+ 3.881+ 9.6);
		int sum2 =(int) Math.round((1.27+ 3.881+ 9.6));
		
		System.out.println("Sum of float using integer casting: " + sum);
		System.out.println("Sum of float using math round casting to integer:" + sum2);
	}

}

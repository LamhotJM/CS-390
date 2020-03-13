package day4_mid;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =1;
		int [] y= new int [10];
		System.out.println("x is " +x);
		System.out.println("x is " +y[0]);
		method(x,y);
		System.out.println("x is " +x);
		System.out.println("y[0] is " + y[0]);

	}
	public static void method(int number, int [] numbers)
	{
		
		numbers[0]=5555;
		number=1001;
	}
	

}

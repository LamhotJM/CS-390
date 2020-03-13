package day1.session1;

/* Purpose:     This program checking data type
Author:         Lamhot Jepri Manarihon Siagian
Date:           9/30/2019
Lab Number:    210 Library               */ 


public class DataType {
	public static void main(String args[]) {
	//	int X = 34.5; -> should be float
	//	boolean boo = x; -> should be true or false
		int g = 17; //3
		int y = g;  //4
		y = y + 10; //5
		short s; //6
	    short sd; //short can more than one
	    sd =132;
      //	s=y;// from integer to short can (> to more low) 7
	//	y =s; // from short to would not error
		byte b=3; // 8
		byte v=b; //9
		byte lam=33;// only two
		short n =12;//10
		//v=n; cant short to byte
		//byte k=128;
		
		float xy = 3.4523f;
		//int x = xy; -> would be error
		int x = (int) xy;
		System.out.println("casting float to int " + x);
		double dob = 1.99;
		int intbaru = (int) Math.round(dob);
		System.out.println("casting double using round to int " + intbaru);
		
		//
		
		System.out.println("Casting from Integer to int");
		Integer intSource = 5;
		int intRes = intSource.intValue();
		System.out.println("result ->" + intRes);
		
		System.out.println("Casting from int to Integer");
		int intSource1=5;
		Integer intRes1= Integer.valueOf(intSource1);
		System.out.println("result ->" + intRes1);
		
		
	}

}

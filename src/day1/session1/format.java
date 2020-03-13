package day1.session1;

import java.util.Arrays;
import java.util.Date;

public class format {
	public static void main(String args[])
	{
		System.out.format("$ %,10.5f", 1234567.888);
		System.out.println();
		System.out.format("You owe $ %,5.2f", 1950.50);
		
		System.out.println();
		
		String date = String.format("Todays date : %tD", new Date());
		System.out.println(date);
		
		String t = "Hello,strings can be fun. They have many uses." ;
		String[] result = t.split(",| |\\. |\\.");
		
		System.out.print(Arrays.toString(result));

		
	}

}

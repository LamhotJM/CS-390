package day1.session1;

import java.util.StringJoiner;

public class StringConversion {
	public static void main(String args [])
	{
		String str= "     aku akan kerja di google o";
		System.out.println("Trim result -> "+ str.trim());
		System.out.println("Replace result -> "+ str.replace('o', 'X'));
		System.out.println("Replace first result -> "+ str.replaceFirst("o", "X"));
		System.out.println("Replace all result -> "+ str.replaceAll("o", "X"));
		System.out.println("Start with result -> "+ str.startsWith(" ")); // return boolean
		
		StringJoiner sj = new StringJoiner(".", "[", "]");
		 sj.add("George").add("Sally").add("Fred");
		 String desiredString = sj.toString();
		 System.out.println("String joiner" + desiredString);
		
		}

}
 
package mid.practice;

public class lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	String value = "DJXFSAF45";
	
	char ch;
	for(int i =0; i< value.length(); i++)
	{
		ch = value.charAt(i);
		
		if(Character.isAlphabetic(ch))
		{
			System.out.print(Character.toLowerCase(ch));
		}
		
	}

	}

}

package day2.array;

public class array_basic {
	public static void main(String args[])
	{
		
		int [] mylist= {16,35,7,1,4};
		sum(mylist);
		max(mylist);
	
		}
	
	public static void sum(int []x)
	{
		int sum=0;
		for(int i =0; i< x.length;i++)
		{
			sum += x[i];
		}
		
		System.out.println(sum);
	}
	
	public static void max(int []x)
	{
		int max=x[0];
		for(int i =1; i< x.length;i++)
		{
			if(x[i]> max)
			{
				max = x[i];
			}
		}
		
		System.out.println(max);
	}

}

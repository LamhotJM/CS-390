package exam_final;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class iterator {
	public static void main(String args[])
	{
		String[] arr = { "A", "C", "E" };
		List<String> list = Arrays.asList(arr);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

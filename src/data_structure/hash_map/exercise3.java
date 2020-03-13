package data_structure.hash_map;

import java.util.HashMap;
import java.util.Map;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> courses = new HashMap<>();
		courses.put("fpp", "block1");
		courses.put("map", "block2");
		courses.put("wap", "block3");
		courses.put("dbms", "block4");

		courses.forEach((k, v) -> System.out.println("key -> " + k + " value ->" + v));

		if (courses.containsKey("wap")) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found!");
		}
		

	}

}

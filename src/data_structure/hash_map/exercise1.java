package data_structure.hash_map;

import java.util.Map.Entry;
import java.util.*;

public class exercise1 {

	public static void main(String[] args) {

		Map<String, String> countries = new HashMap<>();
		countries.put("India", "IN");
		countries.put("India", "Indonesia");
		countries.put("United States of America", "US");
		countries.put("Russia", "RU");
		countries.put("Japan", "JP");
		countries.put(null, null);
		System.out.println(countries);

//		System.out.println(countries.keySet());
//		System.out.println(countries.values());
//        
//		//1. Using entrySet
//		for (Entry<String, String> entry : countries.entrySet()) {
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//		}
//
//		for (String key : countries.keySet()) {
//			System.out.println("Key = " + key);
//		}
//
//		// iterating over values only
//		for (String value : countries.values()) {
//			System.out.println("Value = " + value);
//		}
//
//		// iterator
//
//		Iterator<Entry<String, String>> entries = countries.entrySet().iterator();
//		while (entries.hasNext()) {
//			Entry<String, String> entry = entries.next();
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//		}
//
//		// without generic
//
//		Iterator entries1 = countries.entrySet().iterator();
//		while (entries1.hasNext()) {
//			Map.Entry entry = (Map.Entry) entries1.next();
//			String key = (String) entry.getKey();
//			String value = (String) entry.getValue();
//			System.out.println("Key = " + key + ", Value = " + value);
//		}
//
//		// iterating search for the key
//
//		for (String key : countries.keySet()) {
//			String value = countries.get(key);
//			System.out.println("Key = " + key + ", Value = " + value);
//		}
//
//		// using java 8 for each
//		countries.forEach((k, v) -> System.out.println("Item : " + k + " value : " + v));

	}
}
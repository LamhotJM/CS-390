package data_structure.hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> employeeSalary = new HashMap<>();
		employeeSalary.put("Bob", 76000.00);
		employeeSalary.put("Harry", 120000.00);
		employeeSalary.put("Mark", 95000.00);
		employeeSalary.put("Steven", 134000.00);
		employeeSalary.put("John", 500000.00);

		employeeSalary.forEach((k, v) -> System.out.println("key ->" + k + " value -> " + v));

		System.out.println(employeeSalary.keySet());

		// using entry

		for (Entry<String, Double> ent : employeeSalary.entrySet()) {
			System.out.println(ent.getKey() + " -> " + ent.getValue());
		}

	}

}

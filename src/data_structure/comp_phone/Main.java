package data_structure.comp_phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		SmartPhone nokia = new SmartPhone("Nokia", "Lumia 800", 600);
		SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Ace", 800);
		SmartPhone apple = new SmartPhone("Apple", "IPhone4S", 1000);

		List<SmartPhone> smartPhones = new ArrayList<SmartPhone>();
		smartPhones.add(apple);
		smartPhones.add(nokia);
		smartPhones.add(samsung);

		/**
		 * Sort the elements of ArrayList in ascending order. Hint: Collections.sort();
		 */

		Collections.sort(smartPhones);
		System.out.println("Brand name ascending order:");
		for (SmartPhone sp : smartPhones) {
			System.out.println(sp.toString());
		}
		
		Collections.sort(smartPhones, (a, b) -> {
		    return b.getBrand().compareTo(a.getBrand());
		});
		
		System.out.println("Brand name descending order:");
		smartPhones.forEach(sp -> {
		    System.out.println(sp.toString());
		});
		
		Collections.sort(smartPhones, new PriceComparator());
		
		System.out.println("Price name ascending order:");
		smartPhones.forEach(sp -> {
		    System.out.println(sp.toString());
		});

		

		/**
		 * Sort the elements of ArrayList in descending order. Hint: Collections.sort();
		 */

		/**
		 * Sort the elements of ArrayList by using PriceComparator. Hint:
		 * Collections.sort();
		 */

		//Collections.sort();

		/**
		 * Replace PriceComparator with using lambda function, we can provide sorting
		 * logic at runtime as well: Hint: Collections.sort();
		 */

	//	Collections.sort();

	}

}

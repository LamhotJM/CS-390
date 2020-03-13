package inner_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        SmartPhone nokia = new SmartPhone("Nokia", "Lumia 800",600);
        SmartPhone samsung = new SmartPhone("Samsung", "Galaxy Ace",800);
        SmartPhone apple = new SmartPhone("Apple", "IPhone4S",1000);
        
        List<SmartPhone> smartPhones = new ArrayList<SmartPhone>();
        smartPhones.add(apple);
        smartPhones.add(nokia);
        smartPhones.add(samsung);
        
        
        /** Sort the elements of ArrayList in ascending order. 
         *  Hint: Collections.sort();
        */
        
        Collections.sort(smartPhones);
        System.out.println(smartPhones);
        
        /** Sort the elements of ArrayList in descending order. 
         *  Hint: Collections.sort();
        */
        System.out.println(" Reverse order sorting...");
        Collections.sort(smartPhones, Collections.reverseOrder());
        System.out.println(smartPhones);
        
        /** Sort the elements of ArrayList by using PriceComparator. 
         *  Hint: Collections.sort();
        */
        System.out.println("Sorting Brands based on price comparator. And Lambda class..");
        Collections.sort(smartPhones, (smp1,smp2)->{
//        	if(smp1.getPrice()>smp2.getPrice()) return 1;
//    		else if(smp1.getPrice()<smp2.getPrice()) return -1;
    		return smp1.getPrice()-smp2.getPrice();
        });
        System.out.println(smartPhones);
        
        
        System.out.println("Sorting Brands based on price comparator. And Anonymous class..");
        Collections.sort(smartPhones, new Comparator<SmartPhone>(){

			@Override
			public int compare(SmartPhone smp1, SmartPhone smp2) {
				return Double.compare(smp1.getPrice(), smp2.getPrice());
				
			}
        	
        });
        System.out.println(smartPhones);
        /**
         * Replace PriceComparator with using lambda function, 
         * we can provide sorting logic at runtime as well:
         * Hint: Collections.sort();
         */

    System.out.println("Sorting by price using lambda function...");
    Collections.sort(smartPhones, (smp1,smp2)->{
    	if(smp1.getPrice()>smp2.getPrice()) return 1;
		else if(smp1.getPrice()<smp2.getPrice()) return -1;
		return 0 ;
    });
    System.out.println(smartPhones);
	}

}

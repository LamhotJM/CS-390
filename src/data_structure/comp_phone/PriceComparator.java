package data_structure.comp_phone;

import java.util.Comparator;

public class PriceComparator implements Comparator<SmartPhone>{

	@Override
	public int compare(SmartPhone o1, SmartPhone o2) {
	
//		if(o1.getBrand().compareTo(o2.getBrand())!=0)
//			return o1.getBrand().compareTo(o2.getBrand());
			
		return Double.compare(o1.getPrice(), o2.getPrice());
	}

}

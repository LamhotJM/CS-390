package inner_class;

public class SmartPhone implements Comparable<SmartPhone>{

	private String brand;
	private String model;
	private int price;

	public SmartPhone(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "\n SmartPhone brand : " + brand + "\n model : " + model + "\n price : " + price +"\n";
	}

	@Override
	public int compareTo(SmartPhone smPhone) {
		return this.getBrand().compareTo(smPhone.getBrand());
	}

}

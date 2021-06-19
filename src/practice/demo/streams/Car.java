package practice.demo.streams;

public class Car {
    private double price;
    private String model;
	public Car(int price,String model) {
		this.price = price;
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return this.model + " "+this.price;
	}

}

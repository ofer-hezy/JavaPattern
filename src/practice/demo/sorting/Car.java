package practice.demo.sorting;

public class Car implements Comparable<Car> {
	private final String name;
	private final int id;
	private final int year;

	public Car(String name, int id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}

	@Override
	public int compareTo(Car c) {
		return this.name.compareTo(c.getName());

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return this.name + ","+this.year;
	}
}

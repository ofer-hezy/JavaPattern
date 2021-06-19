package practice.demo.sorting;

import java.util.Comparator;

public class CarByYear implements Comparator<Car> {

	@Override
	public int compare(Car a, Car b) {
		return a.getYear() - b.getYear();
	}

}

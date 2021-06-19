package practice.demo.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class TestCar {

	public static void main(String[] args) {
		try {
			
			System.out.println(Locale.getDefault());
			List<Car> cars = new ArrayList<Car>();
			cars.add(new Car("F", 1, 2009));
			cars.add(new Car("B", 1, 2012));
			cars.add(new Car("L", 1, 2018));
			cars.add(new Car("S", 1, 2021));
			cars.add(new Car("A", 1, 2009));
			cars.add(new Car("G", 1, 2014));

			System.out.println(cars.toString());
			Collections.sort(cars);
			System.out.println(cars.toString());
			Collections.sort(cars, Collections.reverseOrder());
			System.out.println(cars.toString());

			Collections.sort(cars, new CarByYear());
			System.out.println(cars.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

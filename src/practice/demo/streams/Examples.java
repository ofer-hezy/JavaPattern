package practice.demo.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Examples {

	public Examples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Car> cars = Stream.of(new Car(100,"audi"), new Car(200,"fiat"),new Car(50,"chevrolet"),new Car(50,"subaru")).collect(Collectors.toList());
		System.out.println(cars);
		
		
		long count = cars.stream().peek(car -> {System.out.println(car+ " ");car.setPrice(car.getPrice() * 1.05);}).count();
		System.out.println("number of cars: "+count);
		System.out.println(cars);
		
		System.out.println("use skip and limit");
		System.out.println(cars.stream().skip(1).limit(2).collect(Collectors.toList()));
		
		List <Car> newCars ;
		System.out.println("sort by name");
		newCars = cars.stream().sorted((c1,c2)->c1.getModel().compareTo(c2.getModel())).collect(Collectors.toList());
		System.out.println(newCars.toString());
		
		System.out.println("sort by price");		
		newCars = cars.stream().sorted((c1,c2) -> Double.compare(c1.getPrice(), c2.getPrice())).collect(Collectors.toList());
		System.out.println(newCars.toString());
		
		System.out.println("find car by minimum price");
		System.out.println(cars.stream().min((c1,c2) -> Double.compare(c1.getPrice(),c2.getPrice())).get());
		System.out.println("find car by maximimum price");
		System.out.println(cars.stream().max(Comparator.comparing(Car::getPrice)).get());
		
		
		System.out.println("use intStream");
		IntStream iStream = IntStream.range(10, 30);
		System.out.println(iStream.skip(5).findFirst().getAsInt());
		
		System.out.println("map cars to double and find the avrage");
		Double avgPrice = cars.stream().mapToDouble(Car::getPrice).average().getAsDouble();
		System.out.println("avrage price: "+ avgPrice);
		
		System.out.println("map cars to double and sum the price via reduce");
		Double carsCost = cars.stream().mapToDouble(Car::getPrice).reduce(0.0, Double::sum);
		System.out.println("Cars cost: "+carsCost);
		
		System.out.println("map cars to double and export as set");
		Set<Double> prices = cars.stream().map(Car::getPrice).collect(Collectors.toSet());
		System.out.println(prices);
		
		System.out.println("group by price");
		Map<Double,List<Car>> byPrice = cars.stream().collect(Collectors.groupingBy(e -> e.getPrice()));
		System.out.println(byPrice.toString());
		
		System.out.println("infinit stream of random numbers limited by 10");
		Stream.generate(Math::random).limit(10).forEach(System.out::println);
		System.out.println("linear stream vs parralel");
		Stream.iterate(2, i-> i*2).limit(10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("run again in parallel");
		//Sequnce.reset();
		Stream.iterate(2, i-> i*2).parallel().limit(10).forEach(i -> System.out.print(i + " "));
		
		
	}

}

package practice.demo.streams;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.Assert;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] numbers = { "11", "88", "99", "5", "6", "175", "4" ,"88"};
		List<String> list = Arrays.asList(numbers);
		System.out.println(list.toString());
		System.out.println("forEach() , forEach teminate the stream");
		list.stream().forEach(n -> System.out.print(n+" "));
		System.out.println();
		System.out.println(list.toString());
		
		System.out.println("convert the list to a new list of  integer ");
		List<Integer> list2 = list.stream().map(n -> Integer.parseInt(n)).collect(Collectors.toList());
		System.out.println(list2.toString());
		assertEquals(new Integer(11),list2.get(0));
		System.out.println("convert list to set via stream");
		System.out.println(list.stream().collect(Collectors.toSet()).toString());
		System.out.println("filter list2 where entry > 80");
		System.out.println(list2.stream().filter(n -> n > 80).collect(Collectors.toList()));
		
		System.out.println("get an array from stream");
		String[] numbers2  = list.stream().toArray(String[]::new);
		System.out.println(Arrays.asList(numbers2).toString());
		Assert.assertArrayEquals(numbers2, numbers);
		
		
		// sort and return first"
		String first = list.stream().sorted().findFirst().get();
		System.out.println("first after sort: "+first);
		Long firstl = list.stream().mapToLong(num -> Integer.parseInt(num)).sorted().findFirst().getAsLong();
		System.out.println("first after map to Long and sort "+firstl);
		System.out.println("flat");
		List<List<String>> namesNested = Arrays.asList( 
			      Arrays.asList("Jeff", "Bezos"), 
			      Arrays.asList("Bill", "Gates"), 
			      Arrays.asList("Mark", "Zuckerberg"));
		System.out.println(namesNested.toString());
		System.out.println(namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList()));
		
		// peek
		
		
		

	}

}

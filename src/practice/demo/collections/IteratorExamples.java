package practice.demo.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class IteratorExamples {
	public static void main(String[] args) {
		String[] numbers = { "11", "88", "99", "5", "6", "175", "4" };

		List<String> list = Arrays.asList(numbers);
		System.out.println("original list:");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("reversed list:");
		System.out.println(list);

		// Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direction : ");
		@SuppressWarnings("rawtypes")
		ListIterator iterator = forward(list.listIterator());

		System.out.println("Displaying list elements in backward direction : ");
		backward(iterator);

		// Map
		System.out.println("map");
		Map<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], numbers[i] + ".v");
		}
		System.out.println("iterete by values");
		Iterator<String> it = map.values().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("iterete by keys");
		it = map.keySet().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		// using Map.Entry
		System.out.println();
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> entry: set) {
			entry.setValue(entry.getKey()+ " .. ");
		}
		set = map.entrySet();
		for (Map.Entry<String, String> entry: set) {
			System.out.print(entry.getValue()+ "  ");
		}
		
	}

	@SuppressWarnings("rawtypes")
	private static ListIterator forward(ListIterator iterator) {
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		return iterator;
	}

	@SuppressWarnings("rawtypes")
	private static ListIterator backward(ListIterator iterator) {
		while (iterator.hasPrevious())
			System.out.print(iterator.previous() + " ");
		System.out.println();
		return iterator;
	}
}

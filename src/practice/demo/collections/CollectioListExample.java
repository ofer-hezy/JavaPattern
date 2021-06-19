package practice.demo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectioListExample {

	public static void main(String[] args) {
		String[] numbers = { "11", "88", "99", "5", "6", "175", "4" };
		System.out.println("original numbers");
		System.out.println(Arrays.toString(numbers));

		System.out.println("ArrayList: is not thread safe");
		List<String> al = Arrays.asList(numbers);

		System.out.println(al.toString());

		System.out.println("Vector: is thread safe");
		List<String> v = new Vector<String>();
		for (int i = 0; i < numbers.length; i++) {
			v.add(numbers[i]);
		}
		System.out.println(v.toString());

		List<String> ls = new ArrayList<String>();
		for (int i = 0; i < numbers.length; i++) {
			ls.add(numbers[i]);
		}

		Iterator<String> it1 = ls.iterator();
		Iterator<String> it2 = ls.iterator();
		System.out.println("print it1");
		it1.forEachRemaining(System.out::print);
		System.out.println();
		System.out.println("add entry to list");
		ls.add("dd");
		System.out.println("printing it2");
		try {
			it2.forEachRemaining(System.out::print);
		} catch (ConcurrentModificationException e) {
			System.out.println("the collection can't change at this point");
		}
		it2 = ls.iterator();
		it2.forEachRemaining(System.out::print);
		
		System.out.println();
		System.out.println("use copyonwrite");
		List<String> cls = new CopyOnWriteArrayList<String>();
		for (int i = 0; i < numbers.length; i++) {
			cls.add(numbers[i]);
		}
		
		it1 = cls.iterator();
		it2 = cls.iterator();
		System.out.println("print it1");
		it1.forEachRemaining(System.out::print);
		System.out.println();
		System.out.println("add entry to list");
		cls.add("dd");
		System.out.println("printing it2 , will not throw exception");
		try {
			it2.forEachRemaining(System.out::print);
		} catch (ConcurrentModificationException e) {
			System.out.println("the collection can't change at this point");
		}
		System.out.println();
		System.out.println("create new iterator from list after modification");
		it2 = cls.iterator();
		it2.forEachRemaining(System.out::print);
		
		
	}

}

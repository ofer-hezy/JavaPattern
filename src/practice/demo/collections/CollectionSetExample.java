package practice.demo.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSetExample {

	public static void main(String[] args) {
		int[] numbers = { 11, 88,99,5, 6, 175, 4,5 };
		System.out.println("original order");
		System.out.println(Arrays.toString(numbers));

		System.out.println("HashSet: is not sorted");
		Set<String> hs = new HashSet<String>();
		for (int i = 0; i < numbers.length; i++) {
			hs.add("" + numbers[i]);
		}	
		System.out.println(hs.toString());

		System.out.println("TreeSet: is sorted");
		Set<String> ts = new TreeSet<String>();
		for (int i = 0; i < numbers.length; i++) {
			ts.add("" + numbers[i]);
		}
		System.out.println(ts.toString());
		
		System.out.println("LinkHashSet: save the original order");
		Set<String> lhs = new LinkedHashSet<String>();
		for (int i = 0; i < numbers.length; i++) {
			lhs.add("" + numbers[i]);
		}
		System.out.println(lhs.toString());

		

		

	}

}

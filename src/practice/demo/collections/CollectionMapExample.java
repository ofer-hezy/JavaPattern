package practice.demo.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CollectionMapExample {

	public static void main(String[] args) {
		String[] numbers = { "11", "88", "99", "5", "6", "175", "4" };
		Map<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < numbers.length; i++) {
			hm.put(numbers[i], numbers[i]);
		}
		System.out.println("HashMap: "+hm);

		Map<String, String> ht = new Hashtable<String, String>();
		for (int i = 0; i < numbers.length; i++) {
			ht.put(numbers[i], numbers[i]);
		}
		System.out.println("HashTable: "+ht);
		
		System.out.println("Wrap a HashTable as a synchronized");
		Map<String, String> shm = Collections.synchronizedMap(hm);
		shm.put("key","value");
		System.out.println("SyncronizedMap: "+shm);
		
		
		
		

	}

}

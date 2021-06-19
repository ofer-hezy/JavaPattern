package practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
		list.add(new Date());
		list.add("string");
		list.add(new Integer(1));

		for (Object o: list) {
			System.out.println(o.getClass().getName()+":  "+o);
		}
	}

}

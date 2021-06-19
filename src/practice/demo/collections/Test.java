package practice.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		for (int i=0;i<10;i++) {
			ls.add(null);
			ls.add(""+i);
		}
		System.out.println(ls.toString());

	}

}

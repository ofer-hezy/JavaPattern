package practice;

import java.util.ArrayList;
import java.util.List;

public class Aa {
	private List<String> list = null;

	public Aa() {
		this.list = new ArrayList<String>();
		this.list.add("first");
	}
	public static void main(String[] args) {
		Aa o = new Aa();
		System.out.println("list before calling Ab");
		System.out.println(o.list);
		new Ab(o.list); // here ab can change o.list
		System.out.println("list after calling Ab");
		System.out.println(o.list);
	}
}

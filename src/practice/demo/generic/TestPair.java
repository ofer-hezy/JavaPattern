package practice.demo.generic;

public class TestPair {	
	public static void main(String[] args) {
		Pair<String, String> p1 = new PairImp<String, String>("key", "value");
		System.out.println(p1.getValue());

		Pair<Integer, String> p2 = new PairImp<Integer, String>(new Integer(1), "One");
		System.out.println(p2.getKey().intValue());
	}
}
 
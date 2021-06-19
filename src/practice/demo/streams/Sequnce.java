package practice.demo.streams;

public class Sequnce {
    private static long seq = 0;
	public static long next() {
		return seq++;
	}
	public static void reset() {
		seq = 0;
	}

}

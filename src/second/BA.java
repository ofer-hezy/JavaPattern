package second;

import first.A;

public class BA extends A {

	public static void main(String[] args) {
		BA ba = new BA();
		ba.protectedMethod(); // accessed by inheritance
	}
}

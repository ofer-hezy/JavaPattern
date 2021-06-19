package practice;

import java.io.Serializable;

public class InnerClassExample implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8842093689008178687L;
	/**
	 * 
	 */
	
	private String name = "ofer";

	public static void main(String argv[]) {
		InnerClassExample outer = new InnerClassExample();
		//Inner ic = outer.new Inner();
		//ic.show();
		outer.work();

	}
	private void work() {
		Inner inner = new Inner();
		inner.show();
	}

	private class Inner {
		Inner() {}

		private String innerName = "ofer.hezy";

		void show() {
			System.out.println("inner name: " + this.innerName);
			System.out.println("outer name: " + name);

		}
	}

}

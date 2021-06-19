package practice;

public class AbstractClassImp extends AbstractClass {
	@Override
	void whoami() {
		System.out.println("i am " + this.getClass().getCanonicalName());
	}

	public static void main(String[] args) {
		AbstractClass a = new AbstractClassImp();
		a.setName("ofer");
		System.out.println(a.getName());
		a.whoami();
	}
}

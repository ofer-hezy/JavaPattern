package practice;

public abstract class AbstractClass {
	private String name = null;

	abstract void whoami();

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

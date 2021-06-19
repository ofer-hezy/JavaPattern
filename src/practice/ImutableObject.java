package practice;

public class ImutableObject {
	private final String name;
	private final int age;

	public ImutableObject(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "name: "+this.name + ",age: "+this.age;
	}
	public static void main(String[] args) {
		
		ImutableObject im = new ImutableObject("ofer", 50);
		System.out.println(im.toString());
		// im object can't change !!!!
		
		
		
	}

}

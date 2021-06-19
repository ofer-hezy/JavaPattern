package home.demo.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		User u;
		u = new UserBuilder("Ofer", "Hezy").age(49).build();
		System.out.println(u.toString());
		u = new UserBuilder("Ofer", "Hezy").build();
		System.out.println(u.toString());
		
	}

}

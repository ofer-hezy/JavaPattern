package home.demo.pattern.builder;

public class User {
	private String firstName;
	private String lastName;
	private int age;

	public User(UserBuilder builder) {
		this.firstName = builder.getFirstName();
		this.lastName = builder.getLastName();
		this.age = builder.getAge();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "firstName: "+this.firstName + ", lastName: "+this.lastName + ", age: "+this.age;
	}

}

package home.demo.pattern.builder;

public  class UserBuilder {
	private final String firstName;
	private final String lastName;
	private int age;
	
	public UserBuilder(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}
	public User build() {
		return new User(this);
	}
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

}

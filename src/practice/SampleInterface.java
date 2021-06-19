package practice;

public interface SampleInterface {
	String uuid = "#SampleInterface#"; // final static
// should overwrite this,  but not must;
	default void me() {
		System.out.println("Default:  " + this.getClass().getName());
	}
	void setName(String name);
	String getName();

}

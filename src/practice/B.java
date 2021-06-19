package practice;

public class B  extends A{
  private final String NAME = "B";
  private String name = null;
  public B() {}
  public B(String name) {this.name = name;}
  public void me() {
	  System.out.println(NAME);
	  super.me();
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}

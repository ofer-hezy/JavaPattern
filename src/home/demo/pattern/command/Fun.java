package home.demo.pattern.command;

public class Fun {

	public String name;
	public Fun(String name) {this.name = name;}
	public void stop() {
		System.out.println("stopping fun: "+this.name);
	}
	public void start() {
		System.out.println("starting fun: "+this.name);
	}
}

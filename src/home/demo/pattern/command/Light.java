package home.demo.pattern.command;

public class Light {
    private String name = null;
    
    public Light (String name) {this.name = name;}
	
    public void turnOn() {
		System.out.println("turnOn light: "+this.name);
	}
	public void turnOff() {
		System.out.println("turnOff light: "+this.name);
	}
}

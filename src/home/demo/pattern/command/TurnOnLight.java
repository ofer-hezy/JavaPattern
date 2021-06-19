package home.demo.pattern.command;

public class TurnOnLight implements Icommand {
	private Light light;
    public TurnOnLight(Light light) {
    	this.light = light;
    }
	public void execute() {
		this.light.turnOn();
	}
}

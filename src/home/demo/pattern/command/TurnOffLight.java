package home.demo.pattern.command;

public class TurnOffLight implements Icommand {
	Light light;
    public TurnOffLight(Light light) {
    	this.light = light;
    }
	public void execute() {
		this.light.turnOff();
	}
}

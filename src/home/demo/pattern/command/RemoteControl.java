package home.demo.pattern.command;

public class RemoteControl {

	private Icommand command;
	
	public void setCommand(Icommand command) {this.command = command;}
	public void buttonPressed() {
		if (this.command != null)
			this.command.execute();
	}

}

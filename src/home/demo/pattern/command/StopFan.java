package home.demo.pattern.command;

public class StopFan implements Icommand {
	private Fun fun;
    public StopFan(Fun fun) {
    	this.fun = fun;
    }
	@Override
	public void execute() {
		this.fun.stop();

	}

}

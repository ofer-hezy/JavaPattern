package home.demo.pattern.command;

public class StartFan implements Icommand {
	private Fun fun;
    public StartFan(Fun fun) {
    	this.fun = fun;
    }
	@Override
	public void execute() {
		this.fun.start();

	}

}

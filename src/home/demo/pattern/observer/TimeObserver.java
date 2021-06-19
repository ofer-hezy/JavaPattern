package home.demo.pattern.observer;

public class TimeObserver implements Observer {

	private Subject subject;
	
	public TimeObserver() {
		this.subject = Subject.getInstance();
		register();
	}
	public TimeObserver(Subject subject) {
		this.subject = subject;
		register();
	}
	@Override
	public void register() {
		this.subject.register(this);

	}
	@Override
	public void stateChange(Object obj) {
		System.out.println(obj);

	}
	@Override
	public Object getCurrentState() {
		return this.subject.getState();
	}

}

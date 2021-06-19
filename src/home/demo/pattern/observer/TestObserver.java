package home.demo.pattern.observer;

public class TestObserver {

	public static void main(String[] args) {
		try {
			Subject subject = Subject.getInstance();
			Observer o1 = new TimeObserver();
			subject.register(o1);

			Observer o2 = new TimeObserver();
			subject.register(o2);

			subject.stateChange();
			Thread.sleep(1000);
			subject.stateChange();
			subject.unregister(o1);
			Thread.sleep(500);
			subject.stateChange();
			
			Thread.sleep(500);
			System.out.println(o2.getCurrentState());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

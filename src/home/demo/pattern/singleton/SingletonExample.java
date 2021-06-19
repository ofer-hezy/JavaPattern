package home.demo.pattern.singleton;

public class SingletonExample {
	private volatile static SingletonExample self = null;

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		if (self == null) {
			synchronized (Thread.class) {
				if (self == null) {
					self = new SingletonExample();
				}
			}
		}
		return self;
	}

	public void show(int id) {
		System.out.println(id + ": " + self.toString());
	}
}

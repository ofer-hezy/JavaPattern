package home.demo.pattern.singleton;

public class TestSingleton extends Thread{
    private int id ;
	public static void main(String[] args) {
		for (int i = 0; i< 10;i++) {
			new TestSingleton(i).start();
		}
	}
	public TestSingleton(int id) {
		this.id = id;
	}
	public void run() {
		
		SingletonExample.getInstance().show(this.id);
		
	}

}

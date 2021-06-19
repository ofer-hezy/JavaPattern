package practice;

public class ThreadExample extends Thread {
	public static void main(String[] argv) {
		System.out.println("main start");
		ThreadExample w = new ThreadExample();
		w.start();
		System.out.println("main after starting thread");
	}
	public void run() {
		System.out.println("thread is running..");
	}
}

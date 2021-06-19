package practice;

	public class RunnableExample implements Runnable {
		public static void main(String[] argv) {
			System.out.println("main start");
			RunnableExample w = new RunnableExample();
			new Thread(w).start();
			System.out.println("main after starting thread");
		}
	
		@Override
		public void run() {
			System.out.println("thread is running ... ");
		}
	}

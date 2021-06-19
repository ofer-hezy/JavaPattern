package practice;

public class FinalizeExample {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("performing some cleaning  just before destroying ...");
	}

	public static void main(String[] args) {
		try {
			FinalizeExample f = new FinalizeExample();
			System.out.println(f);
			f = null;
			System.gc();
			Thread.sleep(1000);
			System.out.println("exit");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

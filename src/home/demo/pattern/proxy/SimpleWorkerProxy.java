package home.demo.pattern.proxy;

public class SimpleWorkerProxy extends SimpleWorker {
	protected SimpleWorkerProxy(){
		
	}
	@Override
	public void work() {
		System.out.println("I am a proxy");
		super.work();
	}

}

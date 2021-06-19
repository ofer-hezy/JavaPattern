package practice;

public class SampleImp implements SampleInterface {

	private String name = null;
	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public String getName() {
		return this.name;
	}
	/*
	public void me() {
		System.out.println("SimpleImp "+this.getClass().getName());
	}
	*/
	
	public void info() {
		System.out.println(SampleInterface.uuid);
	}
    public static void main(String args[]) {
    	SampleImp sample =  new SampleImp();
    	sample.setName("ofer");
    	System.out.println(sample.getName());
    	sample.info();
    	//System.out.println(SampleImp.uuid);
        sample.me();
       
    }
}

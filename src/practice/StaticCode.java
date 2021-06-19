package practice;

public class StaticCode {
	private static String oname = null;
    static {
    	StaticCode.oname = "abc";
    	System.out.println("set oname "+StaticCode.oname);
    }
    public void show() {
    	System.out.println("show() "+StaticCode.oname);
    }
	
	

}

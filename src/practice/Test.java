package practice;


import java.util.ArrayList;
import java.util.List;

public class Test {
	private String name = "ofer";
	
	public Test() {
		this("John");
	}
	public Test(String name) {
		this.name = name;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		A o = new B();
		o.me();
		System.out.println();
        o = new A();
        o.me();
        System.out.println();
        B b = new B();
        b.me();
      
		ArrayList a = new ArrayList();
        a.add("a");
        a.add("a");
      
   
        for(Object el : a) {
        	System.out.println(el);
        }
       
        Test t = new Test();
        
        System.out.println(t.name);
        t.change(t);
        System.out.println(t.name);
        
        // ArrayList : change member
        List<B> bList = new ArrayList<B>();
        B b1 = new B("just born");
        bList.add(b1);
        System.out.println(bList.get(0).getName());
        b1.setName("after few seconds");
        System.out.println(bList.get(0).getName());
        
        // String
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println();
        System.out.println("s1 == s2 : "+(s1 == s2)); // true
        System.out.println("s1 == s3 : "+(s1 == s3)); //false
        System.out.println("s1.equals(s3) : "+s1.equals(s3)); //true
        
        
        
        
       
	}
	private void change(Test t) {
		
		t.name = t.name.toUpperCase();
	}

}

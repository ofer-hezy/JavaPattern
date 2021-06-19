package home.demo.pattern.decorator;

public class TestDecorator {

	public TestDecorator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			SimpleDataSource sds = new SimpleDataSource();
			sds.writeDate("hello".getBytes());
			System.out.println(new String(sds.readData()));
			ExtendDataSource eds = new ExtendDataSource(sds);
			System.out.println(new String(eds.readData()));
		}catch(Exception e) {e.printStackTrace();}

	}

}

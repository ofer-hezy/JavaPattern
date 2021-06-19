package home.demo.pattern.decorator;

public class SimpleDataSource implements DataSource {

	public SimpleDataSource() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeDate(byte[] data) {
		System.out.println(new String(data));

	}

	@Override
	public byte[] readData() {
		// TODO Auto-generated method stub
		return "sample data".getBytes();
	}

}

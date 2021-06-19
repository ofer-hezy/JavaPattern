package home.demo.pattern.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ExtendDataSource implements DataSource {

	private DataSource ds = null;
	public  ExtendDataSource(DataSource dataSource) {
		this.ds = dataSource;
	}
	@Override
	public void writeDate(byte[] data) {
		// TODO Auto-generated method stub

	}

	@Override
	public byte[] readData() throws IOException{
	 ByteArrayOutputStream baos = new ByteArrayOutputStream();
	 baos.write((byte)'[');
	 baos.write(ds.readData());
	 baos.write((byte)']');
	 return baos.toByteArray();
	}

}

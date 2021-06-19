package home.demo.pattern.decorator;

import java.io.IOException;

public interface DataSource {
   public void writeDate(byte[] data);
   public byte[] readData() throws IOException;
}

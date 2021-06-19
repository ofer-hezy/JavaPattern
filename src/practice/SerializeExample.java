package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ofer\\I.bin"));
			out.writeObject(str);
			out.close();
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\ofer\\I.bin"));
            String o = (String) in.readObject();
            System.out.println(o);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

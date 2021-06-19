package practice.demo.collections;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

	public static void main(String[] args) {
		try {
			String uri = "C://users//ofer//README.txt";
			@SuppressWarnings("resource")
			Stream<String> lines = Files.lines(Paths.get(uri));
			//lines.forEach(System.out::println);
			lines.peek(System.out::println).map(line->line.toLowerCase()).map(line-> line.replace("  ", "")).forEach(System.out::println);
		}catch(Exception ex) {ex.printStackTrace();}

	}

}

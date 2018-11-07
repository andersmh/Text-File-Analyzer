package Code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {

	public static void main(String[] args) {

		try {
			String content;
			content = new String(Files.readAllBytes(Paths.get("fancy.txt")));
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package Code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

	String fileName;

	public FileReader() {

	}

	public FileReader(String fileName) {
		this.fileName = fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public String readFile() throws Exception {

		String content = null;
		content = new String(Files.readAllBytes(Paths.get(fileName)));

		return content;

	}

	

}

package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

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

	public void readFileToConsol() throws IOException {

		String content = null;
		content = new String(Files.readAllBytes(Paths.get(fileName)));
		System.out.println(content);
	}

	@SuppressWarnings("resource")
	public int numberOfLetter(char letter) throws FileNotFoundException {

		Scanner scannerFile = null;
		scannerFile = new Scanner(new File(fileName));

		int count = 0;
		char star = letter;

		while (scannerFile.hasNext()) {
			String character = scannerFile.next();
			int index = 0;
			while (index < character.length()) {

				if (character.charAt(index) == star) {
					count++;
				}
				index++;
			}
		}
		return count;
	}
	
	
	
	
}

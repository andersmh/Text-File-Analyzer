package Code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {

	String fileName;

	public ReadFile() {

	}

	public ReadFile(String fileName) {
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

	
	@SuppressWarnings("unlikely-arg-type")
	public void numberOfWord(String word) throws FileNotFoundException {

		File file = new File(fileName);
		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			int count = 0;
			while (sc.hasNext()) {
			
				if (sc.equals(fileName)) {
					count++;
				}
				sc.next();
			}
			System.out.println(word + ": " + count);
		}

	}

	@SuppressWarnings("resource")
	public void numberOfEachLetter() throws IOException {

		File file = new File(fileName);
		int counter = 0;
		int ch;

		for (char a : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			char toSearch = a;
			counter = 0;

			while ((ch = reader.read()) != -1) {
				if (a == Character.toUpperCase((char) ch)) {
					counter++;
				}
			}
			System.out.println(toSearch + ": " + counter);
		}

	}

}

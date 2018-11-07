package Code;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		FileReader read = new FileReader("fancy.txt");
		
		String s = read.readFile();
		System.out.println(s);
		
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BackwardLines {
	public static void main(String[] args) {
		
		File inputFile = new File("sunshine.txt");
		System.out.println(inputFile.canWrite());
		
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String reverse = "";
		while(fileScanner.hasNext()) {
			String original = "\n" + fileScanner.nextLine();
			for(int i = original.length()-1; i >= 0; i--) {
				reverse += original.charAt(i);
			}
		}
		fileScanner.close();

		PrintWriter writer = null;
		try {
			writer = new PrintWriter("newSunshine.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		writer.write(reverse);
		writer.close();
		
	}
}

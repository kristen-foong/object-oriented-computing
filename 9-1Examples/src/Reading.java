import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
	public static void main(String[] args) {
		
		File inputFile = new File("input2.txt");
		System.out.println(inputFile.canWrite());
		
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(fileScanner.hasNext()) {
			System.out.println(fileScanner.next());
		}
		
		fileScanner.close();
	}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringTooLong {
	
	public static void main(String[] args) {
		File inputFile = new File("UncutString.txt");
		System.out.println(inputFile.canWrite());
		
		//scan from file
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//do the thing
		String cutString = "";
		while(fileScanner.hasNext()) {
			String original = "\n" + fileScanner.nextLine();
			try {
				if(original.length() >= 20) {
					throw new StringTooLongException("The input string is over 20 characters long.");
				}else {
					cutString += original;
				}
			} catch (StringTooLongException e) {
				cutString += original.substring(0,20);
			}
		}
		System.out.println(cutString);
		fileScanner.close();
		
		/*//make new file
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("CutString.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		writer.write(cutString);
	
		writer.close();*/
		
	}

}

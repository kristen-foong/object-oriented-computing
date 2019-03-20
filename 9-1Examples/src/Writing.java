import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writing {
	public static void main(String[] args) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("odds.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for(int i=1; i < 100000; i += 2) {
			writer.write(i + " ");
		}
		writer.close(); 
		//if text file shows blank, make sure you've closed it
		//open the text file to double-check as well
		//refresh the project folder too
	}
}

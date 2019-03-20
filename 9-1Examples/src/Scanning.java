import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanning {

	public static void main(String[] args) {
		File input3 = new File("input3.txt");
		
		
		Scanner scan = null;
		try {
			scan = new Scanner(input3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int count = 0;
		while(scan.hasNext()) {
			String company = scan.next();
			double users = scan.nextDouble();
			String suffix = scan.next();
			System.out.println(count+"The company " + company + " has " + users + suffix + " users");
			count++;
		}
	}
}
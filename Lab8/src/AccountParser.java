/**
 * The AccountParser class contains two static methods. getCollection takes a file name
 * and reads the lines in the file. Those lines are sent to the second method, createAccount.
 * createAccount makes an account with the number and balance information from the string,
 * and returns an account. The getCollection method adds this account to an arraylist of
 * accounts, then returns the arraylist.
 * @auth Kristen Foong
 * @class CPSC 1181
 * @lab Lab8
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountParser {
	
	public static ArrayList<Account> getCollection(String filename){
		ArrayList<Account> accountArr = new ArrayList<Account>();
		File inputFile = new File(filename);

		//scan from file
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//send lines to createAccount method
		while(fileScanner.hasNext()) {
			String curr = fileScanner.nextLine();
			try {
				accountArr.add(createAccount(curr));
			} catch (InvalidBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return accountArr;
	}
	
	public static Account createAccount(String fileLine) throws InvalidBalanceException {
		
		String[] splitLine = fileLine.split("\\s+");
		int number = Integer.parseInt(splitLine[0]);
		double balance = Double.parseDouble(splitLine[1]);
		
		//check if balance is negative
		if(balance < 0) {
			throw new InvalidBalanceException("Invalid Balance: Account " + number + " has a balance of " + balance + ".");
		} else {
			return new Account(number, balance);
		}
		
	}
}

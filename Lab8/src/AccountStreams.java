/**
 * The AccountStreams class is a main program...
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab lab8
 */

import java.util.ArrayList;

public class AccountStreams {

	public static void main(String[] args) {
		ArrayList<Account> accArr = AccountParser.getCollection("accountsSmall.txt");
		for(Account a: accArr) {
			System.out.println("[Acc: " + a.getNumber() + ", " + "Balance: " + a.getBalance() + "]");
		}
	}

}

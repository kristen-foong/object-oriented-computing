/**
 * The AccountStreams class is a main program that parses the accounts.txt file
 * and displays all accounts with invalid balances. It will show accounts with 
 * balances greater than a million, the sum of all accounts whose balance is less
 * than a thousand, the largest account balance, and the account numbers of the
 * first ten accounts with under $25.
 * @auth Kristen Foong
 * @class CPSC1181
 * @lab lab8
 */

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class AccountStreams {

	public static void main(String[] args) {
		ArrayList<Account> accArr = AccountParser.getCollection("accounts.txt");
		
		//balance greater than $1,000,000
		long overMillion = accArr.stream()
				.filter(i->(i.getBalance() > 1000000))
				.count();
		System.out.println("\nThere are " + (int)overMillion + " accounts with balances greater than $1,000,000.");
		
		//sum of the balances of all accounts whose balance is < $1000
		double underThousand = accArr.stream()
				.filter(i->(i.getBalance()<1000))
				.mapToDouble(i->i.getBalance())
				.sum();
		System.out.println("$" + underThousand + " is the sum of all accounts whose balance is less than $1000.");
		
		//largest account balance
		Optional<Account> largestBalance = accArr.stream()
				.max((a,b)->((int)a.getBalance() - (int)b.getBalance()));
		System.out.println("The largest balance is: $" + largestBalance.get().getBalance());
		
		//account numbers of the first ten accounts that have balances < $25
		Account[] accountNums = accArr.stream()
				.filter(a->a.getBalance() < 25)
				.limit(10)
				.toArray(Account[]::new);
		String underTF = "The Account numbers for the first ten accounts that have balances less than $25 are:\n";
		for(Account a: accountNums) {
			underTF += a.getNumber() + "\n";
		}
		System.out.println(underTF);
	}

}

/**
 * The InvalidBalanceException class is an exception that is thrown when the
 * account balance is negative. The constructor has a default message, or a message
 * string can be passed through.
 * @author krist
 * @class CPSC1181
 * @lab Lab8
 */

public class InvalidBalanceException extends IllegalArgumentException{
	public InvalidBalanceException() {
		super("Invalid Balance.");
	}
	public InvalidBalanceException(String message) {
		super(message);
	}
}

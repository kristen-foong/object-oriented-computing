
public class StringTooLongException extends IllegalArgumentException{
	public StringTooLongException() {
		super("String is too long.");
	}
	public StringTooLongException(String message) {
		super(message);
	}
}

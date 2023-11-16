package exceptionTest;

public class BadWordException extends RuntimeException{
	public BadWordException(String message) {
		super(message);
		System.err.println();
	}
}

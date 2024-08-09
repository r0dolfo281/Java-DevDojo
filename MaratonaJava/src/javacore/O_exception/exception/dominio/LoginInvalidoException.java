package javacore.O_exception.exception.dominio;

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException() {
		super("Invalid Login");
	}
	
	public LoginInvalidoException(String message) {
		super(message);
	}

	
	
	
}

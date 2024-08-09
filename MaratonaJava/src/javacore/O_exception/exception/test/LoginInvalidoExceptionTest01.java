package javacore.O_exception.exception.test;

import java.util.Scanner;

import javacore.O_exception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
	public static void main(String[] args) {
		try {
			login();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	private static void login() throws LoginInvalidoException {
		Scanner scan = new Scanner(System.in);
		String usernameDB = "Goku";
		String passwordDB = "dbz";
		
		System.out.print("User: ");
		String usernameDBtyped = scan.nextLine();
		System.out.print("Password: ");
		String passwordDBtyped = scan.nextLine();
		if(!usernameDB.equals(usernameDBtyped) || !passwordDB.equals(passwordDBtyped)) {
			throw new LoginInvalidoException("Wrong username or password. Try again.");
		}
		
		System.out.println("Login successfully");
		
		
		
		
		scan.close();
	}
}

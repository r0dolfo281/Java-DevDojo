package javacore.O_exception.runetime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
	public static void main(String [] args) {
		
		try {
				throw new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Inside of ArrayIndexOutOfBoundsException");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Inside of IndexOutOfBoundsException");
		}catch(IllegalArgumentException e) {
			System.out.println("Inside of IllegalArgumentException");
		}catch(ArithmeticException e) {
			System.out.println("Inside of ArithmeticException");
		}catch(RuntimeException e) {
			System.out.println("Inside of RuntimeException");
		}
		
		try {
			maybeThrowsException();
		}catch(SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void maybeThrowsException() throws SQLException, FileNotFoundException {
		
	}
}


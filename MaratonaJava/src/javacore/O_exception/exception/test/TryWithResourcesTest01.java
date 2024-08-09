package javacore.O_exception.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
	public static void main(String [] args) {
		
	}
	public static void readFile() {
		try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){
			
		}catch(IOException e) {
			
		}
	}
	
	
	
	
	
	
	
	
	public static void readFile2() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("teste.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
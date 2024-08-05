package javacore.M_interfaces.test;

import javacore.M_interfaces.dominio.DataLoader;
import javacore.M_interfaces.dominio.DatabaseLoader;
import javacore.M_interfaces.dominio.FileLoader;

public class DataLoaderTest01 {

	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();

		databaseLoader.load();
		fileLoader.load();

		databaseLoader.remove();
		fileLoader.remove();
		
		databaseLoader.checkPermission();
		fileLoader.checkPermission();
		
		DataLoader.retiveMaxDataSize();
		DatabaseLoader.retiveMaxDataSize();
	}

}

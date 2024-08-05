package javacore.M_interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("DatabaseLoader: loading data from the database");
	}

	@Override
	public void remove() {
		System.out.println("Remove (DatabaseLoader): deleting data from the database");
	}

	@Override
	public void checkPermission() {
		System.out.println("Checking permissions");
	}
	
	public static void retiveMaxDataSize() {
		System.out.println("(DataBAseLoader) Getting data size");
	}
	

}

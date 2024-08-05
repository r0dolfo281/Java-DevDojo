package javacore.M_interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

	@Override
	public void load() {
		System.out.println("FileLoader: loading data from a file\n");
	}

	@Override
	public void remove() {
		System.out.println("Remove (FileLoader): deleting data from a file\n");
	}

	@Override
	public void checkPermission() {
		System.out.println("Checking permissions\n");
	}
	
	

}

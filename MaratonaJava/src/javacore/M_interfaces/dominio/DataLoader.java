package javacore.M_interfaces.dominio;

public interface DataLoader  {
	public static final int MAX_DATA_SIZE = 10;
	public abstract void load();
	
	default void checkPermission() {
		System.out.println("Checking permissions\n");
	}
		
	public static void retiveMaxDataSize() {
		System.out.println("(DataLoader) Getting data size");
	}
}

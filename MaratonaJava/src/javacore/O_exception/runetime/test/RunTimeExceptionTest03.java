package javacore.O_exception.runetime.test;
public class RunTimeExceptionTest03 {
	public static void main(String [] args) {
		//openConection();
		openConection2();
	}
	@SuppressWarnings("unused")
	private static String openConection() {
		try {
			System.out.println("Opening file.");
			System.out.println("Writing data in the file.");
			return "Conection opened";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing resource released by OS.");
		}
		return null;
	}
	
		private static void openConection2() {
			try {
				System.out.println("Opening file.");
				System.out.println("Writing data in the file.");
			} finally {
				System.out.println("Closing resource released by OS.");
			}
			
	}
}

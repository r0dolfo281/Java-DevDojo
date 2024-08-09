package javacore.O_exception.runetime.test;


public class RunTimeExceptionTest02 {
	public static void main(String [] args) {
		System.out.println(division(8, 4));
	}
	
	/**
	 * @param a
	 * @param b - Não pode ser <= 0
	 * @param return a/b
	 */
	
	private static int division(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Argumento inválido! Não é possível dividir por 0.");
		}
		return a/b;
	}
}
